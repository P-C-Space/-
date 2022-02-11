import java.io.File;

public class Main08 {
	public static void MaxByteFile(File dir) {
		File[] subFiles = dir.listFiles();
		int Max = 0;
		File MAX = null;
		for(int i = 0;i<subFiles.length;i++)
		{
			File temp = subFiles[i];
			if(Max < temp.length()) {
				Max = (int)temp.length();
				MAX = temp;
			}			
		}
		System.out.println("가장 큰 파일은"+MAX.getPath()+" "+ Max + "바이트");
	}
	public static void main(String[] args) {
		File f = new File("C:\\");
		MaxByteFile(f);
	}

}