import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main02 extends JFrame{
	public Main02() {
		setTitle("드래깅동안 YELLOW...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		Panel p = new Panel();
		p.setBackground(Color.green);
		
		p.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				p.setBackground(Color.yellow);
			}
		});
		p.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				p.setBackground(Color.green);
			}
		});
		c.add(p);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main02();
		
	}

}