package frame01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		JButton btn1 = new JButton("눌러보세요");
		add(btn1);
		
		btn1.setLocation(10, 10);
		btn1.setSize(100,30);
		this.add(btn1);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
		System.out.println("main 메소드 종료");
	}
}