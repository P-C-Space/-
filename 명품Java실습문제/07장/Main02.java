import java.util.*;
// ArrayList연습
public class Main02 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("5개의 학점을 입력하세요 : ");
		for(int i =0 ;i<5;i++) {
			String temp = scan.next();
			array.add(temp);
		}
		
		for(int i = 0;i<array.size();i++) {
			String temp = array.get(i); // i번째 문자열 얻어오기
			if(temp.equals("A")) {
				System.out.println("학점 ["+temp + "] = 4.0");
			}
			else if(temp.equals("B")){
				System.out.println("학점 [" + temp + "] = 3.0");
			}
			else if(temp.equals("C")){
				System.out.println("학점 [" + temp + "] = 2.0");
			}
			else if(temp.equals("D")){
				System.out.println("학점 [" + temp + "] = 1.0");
			}
			else
				System.out.println("학점 [" + temp + "] = 0");
		}
        scan.close();
	}

}