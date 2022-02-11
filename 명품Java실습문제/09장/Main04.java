import javax.swing.*;
import java.awt.*;

public class Main04 extends JFrame{
	Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, 
			Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, 
			Color.PINK, Color.LIGHT_GRAY };
	public Main04(){
		setTitle("Ten Color buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(1,10));
		
		JButton btn[] = new JButton[10];
		
		for(int i = 0;i<10;i++)
		{
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main04();
	}

}