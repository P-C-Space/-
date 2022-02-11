import java.io.*;

public class Main9 {
	public static void DeleteFile(File temp) {
		File[] subFiles = temp.listFiles();
		int count=0;
		System.out.println("C:\\temp디렉터리의 .txt 파일의 모두 삭제합니다....");
		for(int i = 0;i<subFiles.length;i++)
		{
			String name = subFiles[i].getName();
			int index = name.lastIndexOf(".txt");
			if(index != -1)
			{
				subFiles[i].delete();
				count++;
				System.out.println("총 "+count+"개의 .txt파일을 삭제하였습니다.");
			}
		}
	}
	public static void main(String[] args) {
		File f = new File("파일경로");
		DeleteFile(f);
	}

}