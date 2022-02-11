import javax.swing.*;
import java.awt.*;

public class Main06 extends JFrame{
	public Main06() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		JLabel [] label = new JLabel[20];
		
		for(int i = 0;i<20;i++) {
			label[i] = new JLabel();
			label[i].setBackground(Color.BLUE);
			int x = (int)(Math.random()*200)+50;
			int y = (int)(Math.random()*200)+50;
			label[i].setLocation(x, y);
			label[i].setSize(10,10);
			label[i].setOpaque(true);
			c.add(label[i]);
		}
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Main06();
	}
}