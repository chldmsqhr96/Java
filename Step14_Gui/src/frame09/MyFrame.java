package frame09;
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
	JTextField inputmsg2;
	JLabel label2;
	
	public MyFrame(String title) {
		super(title);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		inputmsg = new JTextField(10);
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton multi = new JButton("*");
		JButton divide = new JButton("/");
		inputmsg2 = new JTextField(10);
		JLabel label = new JLabel("=");
		label2 = new JLabel();
		
		add(inputmsg);
		add(plus);
		add(minus);
		add(multi);
		add(divide);
		add(inputmsg2);
		add(label);
		add(label2);
		
		plus.addActionListener((e)->{
	    	double num1 = Double.parseDouble(inputmsg.getText());
	    	double num2 = Double.parseDouble(inputmsg2.getText());
	    	//toString을 이용할 수도 있다.
	    	double result = num1 + num2;
		    label2.setText(String.valueOf(result));
	    });
	    
		minus.addActionListener((e)->{
	    	double num1 = Double.parseDouble(inputmsg.getText());
	    	double num2 = Double.parseDouble(inputmsg2.getText());
	    	double result = num1 - num2;
		    label2.setText(String.valueOf(result));
	    });
	    
		multi.addActionListener((e)->{
	    	double num1 = Double.parseDouble(inputmsg.getText());
	    	double num2 = Double.parseDouble(inputmsg2.getText());
	    	double result = num1 * num2;
		    label2.setText(String.valueOf(result));
	    });
	    
	    divide.addActionListener((e)->{
	    	double num1 = Double.parseDouble(inputmsg.getText());
	    	double num2 = Double.parseDouble(inputmsg2.getText());
	    	double result = num1 / num2;
		    label2.setText(String.valueOf(result));
	    });

		setVisible(true);
}

	public static void main(String[] args) {
		new MyFrame("계산기");
	}

	public void actionPerformed(ActionEvent e) {
	}
}