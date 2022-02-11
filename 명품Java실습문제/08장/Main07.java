import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main07 {

	public static void main(String[] args) {
		File src = new File("파일경로\\a.jfif");
		File dest = new File("파일경로\\b.jfif");
		int c;
		int count = 0,div = 1;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			System.out.println(src.getPath() + "를 "+ dest.getPath()+"로 복사합니다");
			System.out.println("10%마다 *를 출력합니다");
			while((c=fi.read())!=-1) {
				fo.write((byte)c);
				count++;
				if(((src.length())/10*div ) == count ) {
					System.out.print("*");
					div++;
				}
			}
			fi.close();
			fo.close();
			
		}catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}