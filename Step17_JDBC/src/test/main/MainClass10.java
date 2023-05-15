package test.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		int num = 1;
		String name = "호빵";
		String addr = "독산동";
		
		MemberDto m = new MemberDto();
		m.setNum(num);
		m.setName(name);
		m.setAddr(addr);
		
		update(m);
	}
	
	public static void update(MemberDto m) {
		Connection conn=null;
	    PreparedStatement pstmt = null;
	    
	    try {
	    	conn=new DBConnect().getConn();
	    	
	    	String sql = "UPDATE members"
	    			   + " SET name=?, addr=?"
	    			   + " WHERE num=?";
	    	
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	pstmt.setString(1, m.getName());
	    	pstmt.setString(2, m.getAddr());
	    	pstmt.setInt(3, m.getNum());
	    	
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 저장했습니다.");

	    } catch (Exception e) {}		
	}
}