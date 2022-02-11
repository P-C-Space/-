import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main07 extends JFrame{
	public Main07() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				int size = la.getFont().getSize();
				if(n<0&&size>5) {
					la.setFont(new Font("Arial",Font.PLAIN,size-5));			
				}
				else {
					la.setFont(new Font("Arial",Font.PLAIN,size+5));
				}
			}
		});
		c.add(la);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main07();
	}

}