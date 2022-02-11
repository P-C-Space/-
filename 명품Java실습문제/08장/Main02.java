import java.io.*;

public class Main02 {
	public static void main(String[] args)
	{
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("저장된 파일 위치");
			System.out.println("C:\\temp\\phone.txt를 출력합니다.");
			while ((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();;
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}