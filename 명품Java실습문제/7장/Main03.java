import java.util.*;
public class Main03 {

	public static void main(String[] args) {
		HashMap<String,Integer>nations =new HashMap<String,Integer>();
		Scanner scan = new Scanner(System.in);
		
		String Contry;
		int PeopleNumber;
		
		for(int i=0;i<10;i++)
		{
			Contry = scan.next();
				PeopleNumber = scan.nextInt();
			nations.put(Contry,PeopleNumber);
		}
		
		//입력 확인을 위한 출력문
		Set<String>keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("("+key+", "+nations.get(key)+")");
		}
		
		System.out.print("찾으시는 나라를 입력하세요 : ");
		String find = scan.next();
		if(nations.containsKey(find)) {
			System.out.println("찾으시는 나라가 존재합니다.");
			System.out.println("나라 이름 : " + find+", 인구 수 : "+nations.get(find));
		}
		else {
			System.out.println("찾으시는 나라는 Hashmap에 존재하지 않습니다");
		}
		
		
		scan.close();
	}

}