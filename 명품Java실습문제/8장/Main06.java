import java.io.*;
import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		FileReader fin1 = null;
		FileReader fin2 = null;
		FileWriter fin3 = null;
		BufferedReader bufReader1 = null,bufReader2 = null;
		String Line1 = "",Line2 = "";
		String File1,File2;
		Scanner s = new Scanner(System.in);
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		try {
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			File1 = s.nextLine();
			System.out.print("두번째 파일 이름을 입력하세요>>");
			File2 = s.nextLine();
			fin1 = new FileReader("파일경로"+File1);
			fin2 = new FileReader("파일경로"+File2);
			fin3 = new FileWriter("파일경로\\appended.txt");
			bufReader1 = new BufferedReader(fin1);
			bufReader2 = new BufferedReader(fin2);
			while((Line1 = bufReader1.readLine())!=null) {
				fin3.write(Line1,0,Line1.length());
				fin3.write("\r\n", 0, 2);	
			}
			while((Line2 = bufReader2.readLine())!=null) {
				fin3.write(Line2,0,Line2.length());
				fin3.write("\r\n", 0, 2);	
			}
			
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
			fin1.close();
			fin2.close();
			fin3.close();
			bufReader1.close();
			bufReader2.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		s.close();
	}
}