import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class CapitalGameHash{
	HashMap<String,String> h = new HashMap<String,String>();
	
	
	int count = 0;
	public void Menu() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다 ****");
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("입력:1, 퀴즈: 2, 종료:3 >> ");
			int input = s.nextInt();
			switch(input) {
			case 1:
				insert(s);
				break;
			case 2:
				run(s);
				break;
			case 3:
				System.out.println("게임을 종료합니다");
				return;
			default:
				break;
			}
		}
	}
	private void insert(Scanner s) {
		
		while(true) {
		count ++;
		System.out.print("나라와 수도 입력 "+ count +" >>");
		String country = s.next();
		if(country.equals("그만"))
			break;
		if(Checking(country)) {
			System.out.println(country + "는 이미 있습니다!");
			continue;
		}
		String capital = s.next();
		h.put(country,capital);
		}
	}
	private void run(Scanner s) {
		Set<String> keys = h.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String temp = it.next();
			System.out.print(temp + "의 수도는? ");
			String input = s.next();
			if(h.get(temp).equals(input))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");
		}
		
	}
	private boolean Checking(String country) {
		for(int i = 0;i<h.size();i++) {
			if(h.containsKey(country))
					return true;
		}
		return false;
	}
}
public class Main11_2 {
	public static void main(String[] args) {
		CapitalGameHash CGH= new CapitalGameHash();
		CGH.Menu();
	}

}