import javax.swing.*;
import java.awt.*;

public class Main08 extends JFrame{
	public Main08() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(),BorderLayout.NORTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);
		c.add(new SouthPanel(),BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
	class NorthPanel extends Panel {
		public NorthPanel(){
		setBackground(Color.gray);
		JButton btn[] = new JButton[3];
		btn[0] = new JButton("열기");
		btn[1] = new JButton("닫기");
		btn[2] = new JButton("나가기");
		for(int i =0;i<3;i++)
			add(btn[i]);		
		}
	}
	class CenterPanel extends Panel {
		public CenterPanel() {
			setBackground(Color.white);
			setLayout(null);
			JLabel[] label = new JLabel[10];
			for(int i = 0;i<10;i++) {
				label[i] = new JLabel("*");
				label[i].setForeground(Color.red);
				label[i].setBackground(Color.white);
				int x = (int)(Math.random()*200)+10;
				int y = (int)(Math.random()*200)+10;
				label[i].setLocation(x, y);
				label[i].setSize(10,10);
				label[i].setOpaque(true);
				add(label[i]);
			}
		}
	}
	class SouthPanel extends Panel {
		public SouthPanel() {
			setBackground(Color.yellow);
			JButton btn = new JButton("Word Input");
			TextField tf = new TextField(20);
			add(btn);
			add(tf);
		}
	}
	public static void main(String[] args) {
		new Main08();
	}

}