import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main05 extends JFrame{
	public Main05() {
		setTitle("+,-키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JLabel label = new JLabel("Love Java");
		label.setFont(new Font("Arial",Font.PLAIN,10)); // Arial 폰트로 10픽섹 크기
		Font f = label.getFont();

		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int size = f.getSize();
				if(e.getKeyCode() == KeyEvent.VK_ADD || e.getKeyCode()==KeyEvent.VK_EQUALS) { // 전자는 숫자패드의 + 후자는 Shift와 함께쓰는 버튼입니다.
					label.setFont(new Font("Arial",Font.PLAIN,size+5));
				}
				// 플러스와 동일
				else if((e.getKeyCode() == KeyEvent.VK_MINUS || e.getKeyCode() == KeyEvent.VK_SUBTRACT) && size > 5) {
					label.setFont(new Font("Arial",Font.PLAIN,size-5));
				}
			}
		});
		
		c.add(label);
		
		setSize(300,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main05();
	}

}