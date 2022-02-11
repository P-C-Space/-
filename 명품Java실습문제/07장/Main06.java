import java.util.Iterator;
import java.util.Vector;

abstract class GraphicObject{
	int x,y,w,h;
	GraphicObject(int x,int y,int w,int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public abstract void view();
}
class Rect extends GraphicObject{
	Rect(int x,int y,int w,int h){
		super(x,y,w,h);
	}
	
	public void view() {
		System.out.println(x + ", " + y +" -> " + w + ", " + h + "의 사각형");
	}
}

class Line extends GraphicObject{
	Line(int x,int y,int w,int h){
		super(x,y,w,h);
	}
	
	public void view() {
		System.out.println(x + ", " + y +" -> " + w + ", " + h + "의 선");
	}
}
public class Main06 {
	Vector<GraphicObject> v= new Vector<GraphicObject>();
	
	void add(GraphicObject ob) {
		v.add(ob);
	}
	void draw() {
		Iterator<GraphicObject> it = v.iterator();
		while(it.hasNext()) {
			it.next().view();
		}
	}
	
	public static void main(String[] args) {
		Main06 g = new Main06();
		g.add(new Rect(2,2,3,4)); // (2,2)에서 3x4짜리 사각형
		g.add(new Line(3,3,8,8)); // (3,3)에서 8x8의 사각형 내의 대각선 직선
		g.add(new Line(2,5,6,6)); // (2,5)에서 6x6의 사각형 내의 대각선 직선
		g.draw();
	}

}