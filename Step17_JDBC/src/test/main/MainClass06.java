package test.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass06 {
	public static void main(String[] args) {
		String name="원숭이";
		String addr="상도동";
		
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
	    
	    	pstmt.setString(1, name);
	    	pstmt.setString(2, addr);
	    	
	    	pstmt.executeUpdate(); // SQL을 실행
	    	System.out.println("회원 정보를 저장했습니다.");

	    } catch (Exception e) {}
	}
}