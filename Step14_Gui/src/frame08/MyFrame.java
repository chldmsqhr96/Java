package frame08;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	JTextField inputmsg;
	JLabel label;
	
	public MyFrame(String title) {
		super(title);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		inputmsg = new JTextField(10);
		JButton sendBtn = new JButton("전송");
		JButton sendBtn2 = new JButton("전송2");
		label = new JLabel();
		
		add(inputmsg);
		add(sendBtn);
		add(sendBtn2);
		add(label);
		
	    sendBtn.addActionListener(this);
	    
	    sendBtn2.addActionListener((e)->{
	    	String msg = inputmsg.getText();
			JOptionPane.showMessageDialog(this, msg);
		    label.setText(msg);
	    });
	    
		sendBtn.setActionCommand("send");
		
		
		setVisible(true);
}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
		
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		String msg = inputmsg.getText();
		
		if(cmd.equals("send")) {
			JOptionPane.showMessageDialog(this, msg);
			label.setText(msg);
		}
	}
}