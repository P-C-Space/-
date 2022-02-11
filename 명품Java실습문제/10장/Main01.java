import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main01 extends JFrame{
	Main01(){
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("사랑해");
		
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				label.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) {
				label.setText("사랑해");
			}
		});
		
		c.add(label);
				
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main01();
	}

}