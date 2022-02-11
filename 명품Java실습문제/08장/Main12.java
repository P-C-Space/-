import java.io.*;
import java.util.*;
public class Main12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		BufferedReader bf = null;
		System.out.println("전체 경로명이 아닌 파일 이르만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		Scanner s = new Scanner(System.in);
		String file = s.nextLine();
		Vector<String> v = new Vector<String>();
		try {
			fin = new FileReader(file);
			bf = new BufferedReader(fin);
			String Line = "";
			while((Line = bf.readLine()) != null) {
				v.add(Line);
			}
			fin.close();
			bf.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
			return;
		}
		while(true) {
			System.out.print("검색할 단어나 문장>> ");
			String word = s.nextLine();
			if(word.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			for(int i =0;i<v.size();i++)
			{
				if(v.get(i).contains(word)) {
					System.out.printf("%3d:",i);
					System.out.println(v.get(i));
				}			
			}
		}
        s.close();
	}

}