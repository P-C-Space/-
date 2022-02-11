import java.util.*;
// Vector연습
public class Main01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<Double> num = new Vector<Double>();
		System.out.println("10개의 실수를 입력하시오");
		for (int i = 0; i < 10; i++) {
			num.add(scan.nextDouble());
		}
		
		double max = 0.0;
		double temp = 0.0;
		Iterator<Double>it = num.iterator();
		while (it.hasNext()) {
			temp = it.next();
			max = (max > temp) ? max : temp;
		}
		System.out.println("10개의 실수 중 최대값은 : "+ max);
        scan.close();
	}

}