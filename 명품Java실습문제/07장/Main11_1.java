import java.util.Scanner;
import java.util.Vector;

class Nation {
	String country;
	String capital;
	Nation(String country,String capital){
		this.country = country;
		this.capital = capital;
	}
	public String getcountry() {
		return country;
	}
	public String getcapital() {
		return capital;
	}
}
class CapitalGame{
	Vector<Nation> v = new Vector<Nation>();
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
		if(Checking(country)){
			System.out.println(country + "는 이미 있습니다!");
			continue;
        }
        String capital = s.next();
		v.add(new Nation(country,capital));
		}
	}
	private void run(Scanner s) {
		for(int i =0;i<v.size();i++)
		{
			System.out.print(v.get(i).getcountry() + "의 수도는? ");
			String input = s.next();
			if(v.get(i).getcapital().equals(input))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");
		}
	}
	private boolean Checking(String country) {
		for(int i = 0;i<v.size();i++) {
			if(v.get(i).getcountry().equals(country))
					return true;
		}
		return false;
	}
}
public class Main11_1 {

	public static void main(String[] args) {
		CapitalGame CG  = new CapitalGame();
		CG.Menu();
	}

}