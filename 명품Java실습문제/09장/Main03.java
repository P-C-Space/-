import javax.swing.*;
import java.awt.*;

public class Main03 extends JFrame{
	public Main03() {
		setTitle("Ten Color button Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		JButton btn[] = new JButton[10];
		for(int i = 0;i<10;i++)
		{
			btn[i] = new JButton(Integer.toString(i));
			c.add(btn[i]);
		}
		
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main03();
	}

}