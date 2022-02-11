import javax.swing.*;
import java.awt.*;
public class Main07 extends JFrame{
	public Main07() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel [] p = new JPanel[3];
		for(int i = 0;i<3;i++)
			p[i] = new JPanel();
		JLabel label = new JLabel("수식 입력");
		TextField tf = new TextField(20);
		p[0].setBackground(Color.LIGHT_GRAY);
		p[0].add(label);
		p[0].add(tf);
		
		c.add(p[0],BorderLayout.NORTH);
		
		p[1].setLayout(new GridLayout(4,4));
		JButton [] btn = new JButton[16];
		for(int i = 0;i<10;i++) {
			btn[i] = new JButton(Integer.toString(i));
			p[1].add(btn[i]);
		}
		btn[10] = new JButton("CE");
		btn[11] = new JButton("계산");
		btn[12] = new JButton("+");
		btn[13]	= new JButton("-");
		btn[14] = new JButton("x");
		btn[15] = new JButton("/");
		for(int i = 10;i<16;i++)
		{
			if(i > 11)
				btn[i].setBackground(Color.CYAN);
			p[1].add(btn[i]);
		}
		
		c.add(p[1],BorderLayout.CENTER);
		
		JLabel label2 = new JLabel("계산 결과");
		TextField tf2 = new TextField(20);
		p[2].setBackground(Color.yellow);
		
		p[2].add(label2);
		p[2].add(tf2);
		
		c.add(p[2],BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main07();
	}

}
