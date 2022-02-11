import java.util.Scanner;
import java.util.Vector;

abstract class Shape{
	public Shape() {};
	public abstract String draw(); 
}
class LineTen extends Shape{
	@Override
	public String draw() {
		return "Line";
	}
}
class RectTen extends Shape{
	@Override
	public String draw() {
		return "Rect";
	}
}
class CircleTen extends Shape{
	@Override
	public String draw() {
		return "Circle";
	}
}

class GraphicEditorbeauty{
	Vector<Shape> v = new Vector<Shape>();
	
	public void Menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
		System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
		int input = s.nextInt();
		switch(input) {
		case 1:
			addshape(s);
			break;
		case 2:
			removeshape(s);
			break;
		case 3:
			Print();
			break;
		case 4:
			System.out.println("beauty을 종료합니다.");
			System.exit(0);
			break;
		default:
			break;
		}
		}
	}
	private void Print() {
		for(int i = 0;i<v.size();i++)
		{
			System.out.println(v.get(i).draw());
		}
	}
	private void addshape(Scanner s) {
		System.out.print("Line(1), Rect(2), Circle(3) >> ");
		int input = s.nextInt();
		switch(input) {
		case 1:
			LineTen L = new LineTen();
			v.add(L);
			break;
		case 2:
			RectTen R = new RectTen();
			v.add(R);
			break;
		case 3:
			CircleTen C = new CircleTen();
			v.add(C);
			break;
		default:
			System.out.println("잘못된 입력");
			break;
		}
	}
	private void removeshape(Scanner s) {
		System.out.println("삭제할 도형의 위치 >> ");
		int remove = s.nextInt();
		if(v.size() <= remove) {
			System.out.println("삭제할 수 없습니다.");
		}
		else
			v.remove(remove);
	}
	
}

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicEditorbeauty GE = new GraphicEditorbeauty();
		GE.Menu();
	}

}