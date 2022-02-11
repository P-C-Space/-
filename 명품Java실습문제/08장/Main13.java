import java.io.*;
import java.util.*;

public class Main13 {
	public static void ListFile(File f) {
		File[]subFiles = f.listFiles();
		for(int i = 0;i<subFiles.length;i++) {
			File file = subFiles[i];
			
			// 파일 종류
			if(file.isDirectory())
				System.out.print("dir\t");
			else if(file.isFile())
				System.out.print("file\t");
			
			System.out.printf(file.length()+"바이트"); // 파일 크기
			System.out.println("   \t"+file.getName()); // 파일이름
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\");
		Scanner s = new Scanner(System.in);
		System.out.println("***** 파일 탐색기입니다. *****");

		while(true) {
			System.out.println("\t["+f.getPath()+"]");
			ListFile(f);
			System.out.print(">>");
			String search = s.nextLine();
			if(search.equals("그만")) {
				break;
			}
			else if(search.equals("..")) {
				File temp = new File(f.getParent());
				f = temp;
			}
			else {
				File temp = new File(f.getPath()+"\\"+search);	
				f = temp;
			}
		}
		s.close();
	}
}