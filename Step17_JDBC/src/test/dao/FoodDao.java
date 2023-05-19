package test.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import test.dto.FoodDto;
import test.util.DBConnect;

public class FoodDao {
	
	public FoodDto getData(int num) {
		FoodDto dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();

			String sql = "SELECT num, fname, price , poo" 
					   + " FROM foods"
					   + " WHERE num=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int price = rs.getInt("price");
				String fname = rs.getString("fname");
				String poo = rs.getString("poo");

				dto = new FoodDto();
				dto.setNum(num);
				dto.setPrice(price);
				dto.setFname(fname);
				dto.setPoo(poo);
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
			} catch (Exception e) {
			}
		}
		return dto;
	}
	
	public List<FoodDto> getList() {
		List<FoodDto> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnect().getConn();

			String sql = "SELECT num, fname, price, poo" 
					   + " FROM foods"
					   + " ORDER BY num ASC";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				FoodDto dto = new FoodDto();
				dto.setNum(rs.getInt("num"));
				dto.setFname(rs.getString("fname"));
				dto.setPrice(rs.getInt("price"));
				dto.setPoo(rs.getString("poo"));
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
			} catch (Exception e) {
			}
		}
		return list;
	}
	
	public boolean insert(FoodDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;

		try {
			conn = new DBConnect().getConn();
			String sql = "INSERT INTO foods"
					   + " (num, fname, price, poo)"
					   + " VALUES(foods_seq.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql); 

			pstmt.setString(1, dto.getFname());
			pstmt.setInt(2, dto.getPrice());
			pstmt.setString(3, dto.getPoo());

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
	
	public boolean update(FoodDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;

		try {
			conn = new DBConnect().getConn();
			String sql = "UPDATE foods"
					   + " SET fname=?, price=?, poo=?"
					   + " WHERE num=?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getFname());
			pstmt.setInt(2, dto.getNum());
			pstmt.setString(3, dto.getPoo());
			pstmt.setInt(4, dto.getNum());

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
		PreparedStatement pstmt = null;

		int rowCount = 0;

		try {
			conn = new DBConnect().getConn();
			String sql = "DELETE FROM foods"
					   + " WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);

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
}