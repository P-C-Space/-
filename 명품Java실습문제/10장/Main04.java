import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main04 extends JFrame{
	public Main04() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JLabel label = new JLabel("Love Java"); 
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {  
					label.setText(label.getText().substring(1) + label.getText().charAt(0));
				}		
			}
		});
		
		c.add(label);
		
		setSize(300,100);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main04();
	}

}