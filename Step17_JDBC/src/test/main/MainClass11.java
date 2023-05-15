package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass11 {
	public static void main(String[] args) {
		int num = 3;
		
		delete(num);
	}
	
	public static void delete(int num) {
		//인자로 전달된 num에 해당하는 회원 정보를 삭제하는 기능을 완성해보기
		//DBConnect 클래스 활용
		Connection conn=null;
	    PreparedStatement pstmt = null;
	    
	    try {
	    	conn=new DBConnect().getConn();
	    	
	    	String sql = "DELETE FROM members"
	    			   + " WHERE num = ?";
	    	
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	pstmt.setInt(1, num);
	    	
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 삭제했습니다.");

	    } catch (Exception e) {}		
	}
}

