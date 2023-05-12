package frameTest;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener {

	public MyFrame(String title) {
		super(title);
		
		File f = new File("C:/acorn202304/myFolder/diary.txt");
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		
		JTextField inputmsg = new JTextField(20);
		JButton sendBtn = new JButton("저장");
		
		p1.add(inputmsg);
		p1.add(sendBtn);
		
		//프레임을 북쪽에 위치
		add(p1, BorderLayout.NORTH);

		//배경색
		p1.setBackground(Color.yellow);
		
		JTextArea ta = new JTextArea();
		add(ta, BorderLayout.CENTER);
		
		JButton readBtn = new JButton("읽어오기");
		p1.add(readBtn);
		
	    sendBtn.addActionListener((e)->{
	    	String msg = inputmsg.getText();
			try {
				if(!f.exists()) {
					f.createNewFile();
					System.out.println("다이어리 파일 생성");
				}
				//파일에 문자열을 출력할 수 있는 객체의 참조값 얻어내기
				FileWriter fw = new FileWriter(f, true); // true를 선언해주면 이어쓰기를 함
				fw.write(msg);
				fw.write("\r\n");
				fw.flush();
				fw.close();
				JOptionPane.showMessageDialog(this, "메세지를 저장했습니다.");
			} catch (IOException e2) {
				e2.printStackTrace();
			}
	    });
	    
		readBtn.addActionListener((e)->{
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(f);
				
				br = new BufferedReader(fr);
				while (true) {
					String line = br.readLine();
					if(line == null) break; //중괄호 생략
					ta.append(line);
					ta.append("\r\n");
				}
			} 
			catch (IOException e3) {
				e3.printStackTrace();
			}
			finally { // 사용했던 스트림은 finally를 통해 닫아주자
				try {
					//close()를 호출 할 때도 null에 주의해서 호출해야 한다.
					if(fr!=null)fr.close();
					if(br!=null)br.close();
				} catch(Exception e4) {}
			}
		});
	    setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame("프레임");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}