import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main03 extends JFrame{
	public Main03() {
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JLabel label = new JLabel("Love Java"); 
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {  
					if(label.getText().equals("Love Java")) {
						label.setText("avaJ evoL");
					}
					else if(label.getText().equals("avaJ evoL")) {
						label.setText("Love Java");	
					}
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
		new Main03();
	}

}