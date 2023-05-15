package test.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.mypac.Members;

public class MainClass08 {
	public static void main(String[] args) {	
		Members m = new Members();
		m.num = 1;
		m.name = "이정호";
		m.addr = "아현동";
		
		update(m);
	}
	
	public static void update(Members m) {
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
	    	String sql = "UPDATE members"
	    			   + " SET name=?, addr=?"
	    			   + " WHERE num=?";
	    	
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	pstmt.setString(1, m.name);
	    	pstmt.setString(2, m.addr);
	    	pstmt.setInt(3, m.num);
	    	
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 저장했습니다.");

	    } catch (Exception e) {}
	}
}