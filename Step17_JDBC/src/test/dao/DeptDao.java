package test.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import test.dto.DeptDto;
import test.util.DBConnect;

public class DeptDao {
	public DeptDto getData(int num) {
		DeptDto dto = null; // 객체 dto를 준비
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT deptno, dname, loc"
					   + " FROM dept"
					   + " WHERE deptno = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("dname");
				String addr = rs.getString("loc");
				
				dto = new DeptDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {}
		  }
		return dto;
	}
	
	public List<DeptDto> getList() {
		List<DeptDto> list = new ArrayList<>();
		DeptDto dto = new DeptDto();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT deptno, dname, loc"
					   + " FROM dept";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto.setNum(rs.getInt("deptno"));
				dto.setName(rs.getString("dname"));
				dto.setAddr(rs.getString("loc"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {}
		  }
		return list;
	}
	
	public boolean insert(DeptDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		//insert, update, delete 작업을 통해서 변화된 (추가, 수정, 삭제) row의 갯수를 담을 변수
		int rowCount = 0;

		try {
			conn = new DBConnect().getConn();
			String sql = "INSERT INTO dept"
					   + "(deptno, dname, loc)"
					   + " VALUES(members_seq.nextVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql); // sql문에 ?가 존재한다면 여기서 완성한다.
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());

			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally { // 예외 여부와 상관없이 무조건 실행
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	public boolean update(DeptDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;

		try {
			conn = new DBConnect().getConn();
			String sql = "UPDATE dept SET"
					   + " dname = ?, loc = ?"
					   + " WHERE deptno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());

			rowCount = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt=null;
				
		int rowCount = 0;
				
		try {
			conn=new DBConnect().getConn();
			String sql = "DELETE FROM dept"
					   + " WHERE deptno = ?";
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