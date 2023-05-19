package test.frame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;

import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame /* implements ActionListener */ {
/*
	JTextFiled inputName, inputAddr;
*/
	DefaultTableModel model = null;
	
	public TestFrame(String title) {
		super(title);
		
		//레이아웃 매니저 설정
		setLayout(new BorderLayout());
		
		JLabel label1 = new JLabel("이름");
		JTextField inputName = new JTextField(10);
		JLabel label2 = new JLabel("주소");
		JTextField inputAddr = new JTextField(10);
		
		JButton addBtn = new JButton("추가");
		JButton deleteBtn = new JButton("삭제");
		
		//패널에 ui 배치
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(addBtn);
		panel.add(deleteBtn);
		
		//패널째로 프레임의 북쪽에 위치
		add(panel, BorderLayout.NORTH);
		
		panel.setBackground(Color.yellow);
		
		//테이블 생성, 테이블에 담을 배열 생성
		JTable table = new JTable();
		String[] colNames = {"번호","이름","주소"};
		
		//테이블에 연결할 모델 객체 생성
		model = new DefaultTableModel(colNames, 0);
		
		//모델 객체를 테이블에 연결
		table.setModel(model);
		
		//스크롤이 가능하도록 테이블을 JScrollPane에 감싼다
		JScrollPane scroll = new JScrollPane(table);
		
		//테이블을 중앙 프레임에 배치
		add(scroll, BorderLayout.CENTER);
		
		List<MemberDto> list = new MemberDao().getList();
		
		for(MemberDto tmp:list) {
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		}
		/*
		addBtn.setActionCommand("add");
		*/
		
		addBtn.addActionListener((e)->{
			MemberDto dto = new MemberDto();
			dto.setName(inputName.getText());
			dto.setAddr(inputAddr.getText());
			
			boolean IsSuccess = new MemberDao().insert(dto);
			if(IsSuccess) {
				JOptionPane.showMessageDialog(this, "저장했습니다.");
			}
			reset();
		});
		
		deleteBtn.addActionListener((e)->{			
			int SelectedRow = table.getSelectedRow();
			if(SelectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 메세지를 선택해주세요.");
				return;
			}
			
			int num = (int)model.getValueAt(SelectedRow, 0);
			int tmp = JOptionPane.showConfirmDialog(this, "삭제 하시겠습니까?");

			if(tmp == JOptionPane.YES_OPTION) {
					
				MemberDao m = new MemberDao();
				boolean isSuccess = m.delete(num);	
			
				if(isSuccess) {
					JOptionPane.showMessageDialog(this, "삭제됐습니다.");
				}
				reset();
			} 
			else {
				reset();
			}
		});
	}
	
	public static void main(String[] args) {
		TestFrame f = new TestFrame("테스트 프레임");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}
	
/*
   @Override
   public void actionPerformed(ActionEvent e) {
      //눌러진 버튼의 액션 command 를 읽어와서 
      String cmd=e.getActionCommand();
      if(cmd.equals("add")) { //만일 추가 버튼을 눌렀다면
         //1. 입력한 이름과 주소를 읽어와서
         String name=inputName.getText();
         String addr=inputAddr.getText();
         //2. MemberDto 객체에 담고
         MemberDto dto=new MemberDto();
         dto.setName(name);
         dto.setAddr(addr);
         //3. MemberDao 객체의 insert() 메소드를 이용해서 DB 에 실제 저장하고 
         boolean isSuccess=new MemberDao().insert(dto);
         //4. 저장성공이면 "저장했습니다" 를 알림에 띄우고
         if(isSuccess) {
            JOptionPane.showMessageDialog(this, "저장했습니다");
            //5. JTable 에 회원목록이 다시 출력되도록 한다.
         }
      }
*/
	public void reset() {
		model.setRowCount(0);
		
		List<MemberDto> list2 = new MemberDao().getList();
		
		for(MemberDto tmp:list2) {
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			model.addRow(row);
		}
	}
}