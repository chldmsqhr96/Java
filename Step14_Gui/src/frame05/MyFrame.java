package frame05;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
   
   //생성자
   public MyFrame(String title) {
      super(title);
      
      // setBounds(x, y, width, height)  창의 위치와 크기 설정
      this.setBounds(100, 100, 500, 500);
      // 이 프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정 
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new FlowLayout());
      
      JButton sendBtn = new JButton("전송");
      add(sendBtn);
      
      Component a = this;
      
      ActionListener listener1 = new ActionListener() {
 		  @Override
    	  public void actionPerformed(ActionEvent e) {
 			  ActionListener b = this;
 			  
    		  System.out.println("전송버튼 누름");
    		  JOptionPane.showMessageDialog(MyFrame.this, "전송합니다");
			  }
      };
      sendBtn.addActionListener(listener1); 
      
      JButton deleteBtn = new JButton("삭제");
      add(deleteBtn);
      
      deleteBtn.addActionListener((e)->{
			System.out.println("삭제버튼 누름");
  		  JOptionPane.showMessageDialog(this, "삭제합니다");
			  
      });
      
      JButton updataBtn = new JButton("수정");
      add(updataBtn);
      
      updataBtn.addActionListener(this);
      
      // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
      setVisible(true);
   }
   
   public static void main(String[] args) {
      //MyFrame 객체 생성
      new MyFrame("나의 프레임5");
      System.out.println("main 메소드가 종료 됩니다.");
   }

@Override
public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(this, "수정합니다");
	}
}