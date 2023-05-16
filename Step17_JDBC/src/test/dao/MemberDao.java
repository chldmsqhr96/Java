package test.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import test.dto.MemberDto;
import test.util.DBConnect;
/*
 * DAO : Data Access Object의 약자
 * 
 * - DB에 insert, update, delete, select 작업을 대신해주는 객체를 생성할 클래스 설계
 */
public class MemberDao {
	public MemberDto getData(int num){
	    MemberDto dto = null;
		//필요한 객체를 담을 지역변수 사전 생성
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = new DBConnect().getConn();
			
			String sql = "SELECT num, name, addr"
					   + " FROM members"
					   + " WHERE num = ?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String addr = rs.getString("addr");
			
				dto=new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally { // 예외 여부와 상관없이 무조건 실행
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e) {}
		}
		return dto;
	}
	
	//전체 회원 정보를 리턴하는 메소드
	public List<MemberDto> getList(){
		//회원 정보를 누적할 객체 생성
		List<MemberDto> list = new ArrayList<>();
		
		//필요한 객체를 담을 지역변수 사전 생성
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//connection 객체 참조값 얻어오기
			conn = new DBConnect().getConn();
			
			//실행할 sql문
			String sql = "SELECT num, name, addr"
					   + " FROM members"
					   + " ORDER BY num desc";
			
			pstmt=conn.prepareStatement(sql);
			//sql문이 미완성이면 여기서 완성
			
			rs = pstmt.executeQuery();
			//반복문을 돌면서 ResultSet에 있는 row에 대한 정보를 추출
			while(rs.next()) {
				//커서가 존재하는 row에 있는 정보를 추출해서 사용
				MemberDto dto = new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				//리스트에 입력된 정보를 추가
				list.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch(Exception e) {}
		}
		//회원 정보가 누적된 list 객체의 참조값 리턴
		return list;
	}
	
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
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