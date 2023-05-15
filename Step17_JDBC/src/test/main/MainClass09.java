package test.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import test.dto.MemberDto;

public class MainClass09  {
	public static void main(String[] args) {
		MemberDto m = new MemberDto();
		m.setName("에이콘");
		m.setAddr("강남역");
		
		insert(m);
	}
	
	public static void insert(MemberDto mem) {
		Connection conn=null;
		
	    try {
	       Class.forName("oracle.jdbc.driver.OracleDriver");
	       String url="jdbc:oracle:thin:@localhost:1521:xe";
	       conn=DriverManager.getConnection(url, "scott", "tiger");
	       System.out.println("Oracle DB 접속 성공");
	    } catch (Exception e) {
	       e.printStackTrace();
	    }
	    
	    PreparedStatement pstmt = null;
	    
	    try {
	    	String sql = "INSERT INTO members"
	    			   + " (num, name, addr)"
	    			   + " VALUES(members_seq.NEXTVAL, ?, ?)";
	    	
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	pstmt.setString(1, mem.getName());
	    	pstmt.setString(2, mem.getAddr());
	    	
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 저장했습니다.");

	    } catch (Exception e) {}
	}
}