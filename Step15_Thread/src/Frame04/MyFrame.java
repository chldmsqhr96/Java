package Frame04;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;
import test.mypac.CountRunnable;

public class MyFrame extends JFrame implements ActionListener{
	   //생성자
	   public MyFrame(String title) {
	      super(title);
	      setBounds(100, 100, 500, 500);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLayout(new FlowLayout());
	      
	      JButton startBtn=new JButton("카운트 다운");
	      startBtn.addActionListener(this);
	      //프레임에 버튼 추가
	      add(startBtn);
	      
	      JTextField tf=new JTextField(10);
	      //프레임에 JTextField 추가
	      add(tf);
	      
	      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
	      setVisible(true);
	   }

	@Override
	public void actionPerformed(ActionEvent e) { // 인터페이스 활용
		/*
		CountRunnable runnable = new CountRunnable();
		Thread t = new Thread(runnable);
		t.start();
		*/
		new Thread(new CountRunnable()).start();
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}