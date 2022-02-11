import javax.swing.*;
import java.awt.*;

public class Main05 extends JFrame{
	Color[] color = { Color.red, Color.ORANGE, Color.yellow, Color.green,
			Color.cyan, Color.blue, Color.magenta, Color.DARK_GRAY, Color.pink,
			Color.LIGHT_GRAY, Color.white, Color.black, Color.black, Color.orange,
			Color.blue, Color.magenta
	};
	public Main05() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();

		c.setLayout(new GridLayout(4,4));
		JLabel [] jlb = new JLabel[16];
		
		for(int i = 0;i<16;i++) {
			jlb[i] = new JLabel(Integer.toString(i));
			jlb[i].setOpaque(true);
			jlb[i].setBackground(color[i]);
			c.add(jlb[i]);
		}
		
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main05();
	}

}