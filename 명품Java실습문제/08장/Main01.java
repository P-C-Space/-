import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		System.out.println("전화번호 입력 프로그램입니다.");
		try {
			fout = new FileWriter("파일 위치");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = scanner.nextLine();
				if(line.length()==0 || line.equals("그만"))
					break;
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}

}