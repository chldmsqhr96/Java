package test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import test.dto.MemberDto;
import test.util.DBConnect;
/*
 * DAO : Data Access Object의 약자
 * 
 * - DB에 insert, update, delete, select 작업을 대신해주는 객체를 생성할 클래스 설계
 */
public class MemberDao {
	//회원의 정보를 저장하고 성공여부(true, false)를 리턴해주는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
	    try {
		       Class.forName("oracle.jdbc.driver.OracleDriver");
		       String url="jdbc:oracle:thin:@localhost:1521:xe";
		       conn=DriverManager.getConnection(url, "scott", "tiger");
		   	} catch (Exception e) {
		       e.printStackTrace();
		}
		
		//insert, update, delete 작업을 통해서 변화된 (추가, 수정, 삭제) row의 갯수를 담을 변수
		int rowCount = 0;
		
		try {
			conn=new DBConnect().getConn();
			String sql = "INSERT INTO members"
					   + " (num, name, addr)"
					   + " VALUES(members_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql); // sql문에 ?가 존재한다면 여기서 완성한다.
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			
			rowCount = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally { // 예외 여부와 상관없이 무조건 실행
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e) {}
		}
		if(rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
	    try {
		       Class.forName("oracle.jdbc.driver.OracleDriver");
		       String url="jdbc:oracle:thin:@localhost:1521:xe";
		       conn=DriverManager.getConnection(url, "scott", "tiger");
		   	} catch (Exception e) {
		       e.printStackTrace();
		}
		
		//insert, update, delete 작업을 통해서 변화된 (추가, 수정, 삭제) row의 갯수를 담을 변수
		int rowCount = 0;
		
		try {
			conn=new DBConnect().getConn();
			String sql = "UPDATE members"
					   + " SET name=?, addr=?"
					   + " WHERE num=?";
			
			pstmt=conn.prepareStatement(sql); // sql문에 ?가 존재한다면 여기서 완성한다. 
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			
			rowCount = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally { // 예외 여부와 상관없이 무조건 실행
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e) {}
		}
		if(rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
	    try {
		       Class.forName("oracle.jdbc.driver.OracleDriver");
		       String url="jdbc:oracle:thin:@localhost:1521:xe";
		       conn=DriverManager.getConnection(url, "scott", "tiger");
		   	} catch (Exception e) {
		       e.printStackTrace();
		}
		
		int rowCount = 0;
		
		try {
			conn=new DBConnect().getConn();
			String sql = "DELETE FROM members"
	    			   + " WHERE num = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			rowCount = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e) {}
		}
		if(rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
}