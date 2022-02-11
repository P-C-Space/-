import java.io.*;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		FileReader fin1 = null;
		FileReader fin2 = null;
		int c1,c2;
		String File1,File2;
		boolean check = true;
		Scanner s = new Scanner(System.in);
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		try {
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			File1 = s.nextLine();
			System.out.print("두번째 파일 이름을 입력하세요>>");
			File2 = s.nextLine();
			fin1 = new FileReader("파일경로"+File1);
			fin2 = new FileReader("파일경로"+File2);
			System.out.println(File1+" 와 "+File2+"를 비교합니다.");
			while((c1 = fin1.read())!=-1&&(c2 = fin2.read()) != -1) {
				if(c1 != c2)
					check = false;
			}
            fin1.close();
            fin2.close();
			if(check)
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 서로 다릅니다.");
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}