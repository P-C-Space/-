import java.io.*;
import java.util.*;

public class Main10 {
	public static void main(String[] args) {
		
		FileReader fin = null;
		BufferedReader bf = null;
		String Line = "";
		Scanner s = new Scanner(System.in);
		HashMap <String,String> HM = new HashMap<String,String>();
		try {
			fin = new FileReader("파일 경로\\phone.txt");
			bf = new BufferedReader(fin);
			while((Line = bf.readLine() )!= null) {
				String[] temp = Line.split(" ");
				HM.put(temp[0],temp[1]);
			}
			fin.close();
			bf.close();
		}catch(IOException e)
		{
			System.out.println("입출력 오류");
		}
		System.out.println("총 "+HM.size()+"개의 전화번호를 읽었습니다.");
		while(true) {
			System.out.print("이름>> ");
			String name = s.nextLine();
			if(name.equals("그만"))
				break;
			System.out.println(HM.get(name));
		}
		s.close();
	}

}