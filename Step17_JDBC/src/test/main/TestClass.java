package test.main;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestClass extends JFrame implements ActionListener {
	public TestClass(String title) {
		super(title);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		add(p1, BorderLayout.NORTH);
		
		JTextField input1 = new JTextField(8);
		p1.add(input1);
		
		JTextField input2 = new JTextField(8);
		p1.add(input2);
		
		JTextField input3 = new JTextField(8);
		p1.add(input3);
		
		JButton Btn = new JButton("저장");
		p1.add(Btn);
		
		setVisible(true);
		
		Btn.addActionListener((e)->{
	    	int num = Integer.parseInt(input1.getText());
	    	String name = input2.getText();
	    	String addr = input3.getText();
	    	
	    	Connection conn=null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				conn=DriverManager.getConnection(url, "scott", "tiger");
				System.out.println("Oracle DB 접속 성공");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			PreparedStatement pstmt = null;
		    
		    try { 
		    	String sql = "INSERT INTO MEMBERS"
		    			   + " (num, name, addr)"
		    			   + " VALUES (?, ?, ?)";
		    	
		    	pstmt=conn.prepareStatement(sql);
		    	
		    	pstmt.setInt(1, num);
		    	pstmt.setString(2, name);
		    	pstmt.setString(3, addr);

		    	pstmt.executeUpdate();
		    	JOptionPane.showMessageDialog(this, "저장했습니다.");

		    } catch (Exception e2) {
		    	e2.printStackTrace();
		    }
		});
	}
	
	public static void main(String[] args) {
		new TestClass("프레임");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}