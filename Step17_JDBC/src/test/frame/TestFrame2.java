package test.frame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import test.dao.FoodDao;
import test.dto.FoodDto;

public class TestFrame2 extends JFrame {
	
	DefaultTableModel model = null;
	
	public TestFrame2(String title) {
		super(title);
		
		setLayout(new BorderLayout());
	
		//라벨, 버튼 설정
		JLabel label1 = new JLabel("상품 관리");
		Font font1 = new Font("바탕", Font.PLAIN, 30);
		Font font2 = new Font("바탕", Font.PLAIN, 12);
		label1.setFont(font1);
		
		JLabel label2 = new JLabel("제품명");
		label2.setFont(font2);
		JTextField inputFname = new JTextField(10);
		
		JLabel label3 = new JLabel("가  격");
		label3.setFont(font2);
		JTextField inputPrice = new JTextField(10);
		
		JLabel label4 = new JLabel("원산지");
		label4.setFont(font2);
		JTextField inputPoo = new JTextField(10);
		
		JButton Btn1 = new JButton("상품 추가");
		JButton Btn2 = new JButton("상품 제거");
		Btn1.setFont(new Font("굴림", Font.BOLD, 12));
		Btn2.setFont(new Font("굴림", Font.BOLD, 12));
		
		
		//레이아웃 상단 문구
		JPanel panel = new JPanel();
		panel.add(label1);
		panel.setBackground(new Color(200,200,200));
		add(panel, BorderLayout.NORTH);
		
		
		//테이블 관리
		JTable table = new JTable();
		String[] colNames = {"관리번호", "상품명", "가격", "원산지"};
		model = new DefaultTableModel(colNames, 0);

		table.setModel(model);
		table.setRowHeight(30);
		table.setBackground(new Color(255,255,255));
		table.setFont(new Font("바탕", Font.PLAIN, 14));
		JScrollPane scroll = new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		
		//테이블 정렬
	    DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
	    dtcr.setHorizontalAlignment(SwingConstants.CENTER);
	    TableColumnModel tcm = table.getColumnModel() ;
	     
	    for(int i = 0; i<tcm.getColumnCount(); i++){
	    	tcm.getColumn(i).setCellRenderer(dtcr);  
	    }
		
		//레이아웃 하단 문구
		JPanel panel2 = new JPanel();
		panel2.add(label2);
		panel2.add(inputFname);
		panel2.add(label3);
		panel2.add(inputPrice);
		panel2.add(label4);
		panel2.add(inputPoo);
		panel2.add(Btn1);
		panel2.add(Btn2);
		panel2.setBackground(new Color(200,200,200));
		add(panel2, BorderLayout.SOUTH);
		
		List<FoodDto> list = new FoodDao().getList();
		
		for(FoodDto tmp:list) {
			Object[] row = {tmp.getNum(), tmp.getFname(), tmp.getPrice()+"원", tmp.getPoo()};
			model.addRow(row);
		}
		
		//레이아웃 좌우
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(200,200,200));
		add(panel3, BorderLayout.WEST);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(200,200,200));
		add(panel4, BorderLayout.EAST);
		
		
		//제품 추가
		Btn1.addActionListener((e)->{
			FoodDto dto = new FoodDto();
			dto.setFname(inputFname.getText());
			dto.setPrice(Integer.parseInt(inputPrice.getText()));
			dto.setPoo(inputPoo.getText());
			
			boolean IsSuccess = new FoodDao().insert(dto);
			if(IsSuccess) {
				JOptionPane.showMessageDialog(this, "상품을 저장했습니다.");
			}
			viewReset();
		});
		
	
		//제품 제거
		Btn2.addActionListener((e)->{
			int SelectedRow = table.getSelectedRow();	
			if(SelectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 상품을 선택해주세요.");
				return;
			}
			
			int num = (int)model.getValueAt(SelectedRow, 0);
			int tmp = JOptionPane.showConfirmDialog(this, "상품을 삭제 하시겠습니까?");
			
			if(tmp == JOptionPane.YES_OPTION) {
				FoodDao m = new FoodDao();
				boolean isSuccess = m.delete(num);	
				if(isSuccess) {
					JOptionPane.showMessageDialog(this, "상품이 삭제됐습니다.");
				}
				viewReset();
			}
			else {
				viewReset();
			}
		});
	}
	
	public static void main(String[] args) {
		TestFrame2 f = new TestFrame2("상품 관리");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 700, 500);
		f.setVisible(true);
	}
	
	public void viewReset() {
		model.setRowCount(0);
		
		List<FoodDto> list2 = new FoodDao().getList();
		
		for(FoodDto tmp:list2) {
			Object[] row = {tmp.getNum(), tmp.getFname(), tmp.getPrice()+"원", tmp.getPoo()};
			model.addRow(row);
		}
	}
}