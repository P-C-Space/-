import java.util.ArrayList;
import java.util.Iterator;
public class Main04 {
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();
		for(int i = 0;i<20;i++) {
			double d = Math.random()*100; // 0.0 ~ 100.0 사이의 랜덤한 실수
			a.add(d);
		}
		// 이 부분 수정
		Iterator<Double> it = a.iterator(); 
		// double이 아닌 Double사용해야함 기본 타입 사용 불가
		while(it.hasNext()) { // 값이 있을때 까지 실행
			double n = it.next(); // 다음 값 n에 저장
			System.out.println(n); // 출력
		}

	}

}