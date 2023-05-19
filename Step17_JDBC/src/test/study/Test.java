package test.study;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
	public static void main(String[] args) {
	    Connection conn=null;
	    
	    try {
	    	
	       Class.forName("oracle.jdbc.driver.OracleDriver");
	       String url="jdbc:oracle:thin:@localhost:1521:xe";
	       conn=DriverManager.getConnection(url, "scott", "tiger");

	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    try {
	    	String sql = "SELECT empno, ename, deptno, job"
	    			   + " FROM emp";
	    	
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	rs=pstmt.executeQuery();
	    	
	    	while(rs.next()) {
	    		int empno = rs.getInt("empno");
	    		String ename = rs.getString("ename");
	    		int deptno = rs.getInt("deptno");
	    		String job = rs.getString("job");
	    		System.out.println(empno + " | " + ename + " | "
	    						   + deptno+ " | " + job);
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
	}
}