import java.util.*;

class WordTest {
	HashMap<String,String> HM = new HashMap<String,String>();
	ArrayList<Boolean> Check = new ArrayList<Boolean>(); //문제를 냈는지 체크
	WordTest(){
		HM.put("love","사랑");
		HM.put("animal","동물");
		HM.put("emtion","감정");
		HM.put("human","인간");
		HM.put("stock","주식");
		HM.put("trade","거래");
		HM.put("society","사회");
		HM.put("baby","아기");
		HM.put("honey","애인");
		HM.put("dall","인형");
		HM.put("bear","곰");
		HM.put("picture","사진");
		HM.put("painting","그림");
		HM.put("fault","오류");
		HM.put("example","보기");
		HM.put("eye","눈");
		HM.put("statue","조각상");

		Scanner s = new Scanner(System.in);
		int Input;
		
		while(true) {
			System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
			System.out.print("단어 테스트: 1, 단어 삽입: 2, 종료: 3>>");
			Input  = s.nextInt();
			s.nextLine();
			switch(Input) {
			case 1:
				for(int i = 0;i<HM.size();i++)
					Check.add(false); //초기화
				System.out.println("현재 "+HM.size()+"개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다");
				TestRun(s);
				System.out.println();
				break;
			case 2:
				System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
				AddWord(s);
				System.out.println();
				break;
			case 3:
				System.out.println("\"명품영어\"를 종료합니다.");
				return;
			}
		}
	}
	private void TestRun(Scanner s) {
		Set<String> keys = HM.keySet();
		int TestTime = 0;
		while(true) {
			if(TestTime>=HM.size()) {
				System.out.println("모든 테스트를 진행하였습니다. 종료합니다.");
				return;
			}
			Iterator<String> it = keys.iterator();
			Iterator<String> it2 = keys.iterator();
			int size = HM.size()-1;
			int Random = (int)(Math.random()*size);
			String problem = "";
			if(Check.get(Random) != false)
				continue;
			int k = 0;
			while(it.hasNext()) {
				String temp=it.next();
				if(k == Random)
				{
					problem = temp;
				}
				k++;
			}
			TestTime++;
			System.out.println(TestTime + "번째 실행");
			System.out.println(problem);
			int order[] = new int[4];
			int random1,random2,random3;
			while(true) {
			random1 = (int)(Math.random()*size);
			random2 = (int)(Math.random()*size);
			random3 = (int)(Math.random()*size);
			if(random1 != random2 && random1 != random3 &&
					random1 != Random && random2 != random3 && 
					random2 != Random && random3 != Random)
				break;
			}
			
			order[0] = random1;
			order[1] = random2;
			order[2] = random3;
			order[3] = Random;
			
			Arrays.sort(order);
			int count = 0;
			for(int i =0;i<HM.size();i++)
			{
				String temp = it2.next();
				for(int j = 0;j<4;j++) {
					if(i == order[j])
						System.out.print("("+ ++count + ")" + HM.get(temp) + " ");
				}
			}
			System.out.print(" :> ");
			try {
			int Input = 0;
			Input = s.nextInt();
			if(Input == -1)
				break;
			else if(order[Input-1] == Random)
				System.out.println("Excellent !!");
			else
				System.out.println("NO. !!");
			}
			catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요 !!");
				s.nextLine();
				continue;
			}
		}
		
		
	}
	private void AddWord(Scanner s) {
		while(true) {
			System.out.print("영어 한글 입력 >> ");
			String eng = s.next();
			if(eng.equals("그만"))
				break;
			String kor = s.next();
			HM.put(eng, kor);
			Check.add(false);
		}
	}
}
public class Main12 {

	public static void main(String[] args) {
		new WordTest();
	}

}