import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main06 extends JFrame{
	public Main06() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel l = new JLabel("C");
		l.setSize(10,10);
		l.setLocation(100, 100);
		
		c.add(l);
		
		l.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random()*250);
				int y = (int)(Math.random()*250);
				l.setLocation(x, y);
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main06();
	}

}