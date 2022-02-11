import java.util.*;

class ControlProgram{
	ArrayList<String> excution = new ArrayList<String>();
	ArrayList<String> temp = new ArrayList<String>();
	HashMap<String,Integer> var = new HashMap<String,Integer>();
	ArrayList<String> num = new ArrayList<String>();
	
	String [] alpha= {"a","b","c","d","e","f","g",
			"h","i","j","k","l","n","m","o",
			"p","q","r","s","t","u","v","w","x","y","z"};
	
	public ControlProgram() {
		Scanner s = new Scanner(System.in);
		System.out.println("수퍼컴이 작동합니다. 프로그램을 입력해주세요. GO를 입력하면 작동합니다.");
		
		while(true) {
			System.out.print(">> ");
			String temp1 = s.next();
			if(temp1.equals("go"))
				break;
			String temp2 = s.next();
			String temp3 = s.next();
			s.nextLine();
			excution.add(temp1);
			temp.add(temp2);
			num.add(temp3);
		}
		run();
		
		s.close();
	}
	private boolean Compare(String s) {
		for(int i = 0;i<alpha.length;i++)
		{
			if(s.contains(alpha[i]))
				return true;
		}
		return false;
	}
	
	private void run() {
		int count = 0;
		while(true) {
			switch(excution.get(count)) {
			case "mov":
				if(Compare(num.get(count))) // 알파벳 포함 여부 
					var.put(temp.get(count),var.get(num.get(count)));
				else // 알파벳이 아니라 정수형이면
					var.put(temp.get(count), Integer.parseInt(num.get(count)));
				count++;
				break;
			case "add":
				if(Compare(num.get(count))) // 알파벳 포함 여부 
					var.replace(temp.get(count), var.get(temp.get(count))+var.get(num.get(count)));
				else
					var.replace(temp.get(count), var.get(temp.get(count))+Integer.parseInt(num.get(count)));
				count++;
				break;
			case "sub":
				if(Compare(num.get(count))) // 알파벳 포함 여부 
					var.replace(temp.get(count), var.get(temp.get(count))-var.get(num.get(count)));
				else
					var.replace(temp.get(count), var.get(temp.get(count))-Integer.parseInt(num.get(count)));
				count++;
				break;
			case "jn0":
				int k;
				if(Compare(num.get(count)))
					k = var.get(num.get(count));
				else
					k = Integer.parseInt(num.get(count));
				if(var.get(temp.get(count)) != 0)
					count = k;
				else
					count++;
				break;
			case "prt":
				if(Compare(num.get(count)))
					System.out.println("[ptr "+ temp.get(count) +" "+ var.get(num.get(count)) +"]");
				else
					System.out.println("[ptr "+ temp.get(count) + " " + num.get(count) + "]");
				Set<String> keys = var.keySet();
				Iterator<String> it = keys.iterator();
				for(int i =0;i<var.size();i++)
				{
					String t = it.next();
					System.out.print(t.toUpperCase()+":"+var.get(t)+" ");
				}
				System.out.println();
				System.out.println("출력할 결과는 "+ var.get(temp.get(count))+". 프로그램 실행 끝");
				return;
			}
		}
	}
}

public class Main13 {
	public static void main(String[] args){
		new ControlProgram();
	}
}