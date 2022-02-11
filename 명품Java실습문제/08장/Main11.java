import java.io.*;
import java.util.*;
public class Main11 {
	public static void main(String[] args) {
		FileReader fin = null;
		BufferedReader bf = null;
		Vector<String> v = new Vector<String>();
		Scanner s = new Scanner(System.in);
		
		try {
		fin = new FileReader("파일 경로\\words.txt");
		bf = new BufferedReader(fin);
		String Line = " ";
		System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다...");
		while((Line = bf.readLine())!=null) {
			v.add(Line);
		}
		bf.close();
		fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		while(true) {
			int count = 0;
			System.out.print("단어>>");
			String word = s.next();
			if(word.equals("그만")){
            	System.out.println("종료합니다...");
				break;
			}
            for(int i = 0;i<v.size();i++)
			{
				if(word.length() <= v.get(i).length()){
					if(v.get(i).substring(0, word.length()).equals(word)) {
						System.out.println(v.get(i));
						count++;
					}
				}
			}
			if(count == 0)
				System.out.println("발견할 수 없음");
				
		}
		
		s.close();
	}
}