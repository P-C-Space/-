import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main04 {
	public static void main(String[] args)
	{
		FileReader fin = null;
		BufferedReader bufReader = null;
		try {
			fin = new FileReader("C:\\windows\\system.ini");
			bufReader = new BufferedReader(fin);
			String line = "";
			int count = 1;
			while((line = bufReader.readLine()) != null) {
				System.out.printf("%3d: ",count);
				System.out.println(line);
				count++;
			}
			fin.close();
			bufReader.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}