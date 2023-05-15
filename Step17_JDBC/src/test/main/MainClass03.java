package test.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClass03 {
	public static void main(String[] args) {
		Connection conn=null;
		int num = 3;
		String addr = "에버랜드";
    
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott", "tiger");
			//예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
	    
	    try { // 실행할 sql문을 선언된 String sql에 담는다. 
	    	String sql = "UPDATE members set addr=?"
	    			   + " where num=?";
	    	
	    	//PreparedStatement를 통해 SQL을 전달하면서 객체의 참조값 얻기.
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	pstmt.setString(1, addr);
	    	pstmt.setInt(2, num);
	    	
	    	pstmt.executeUpdate(); // SQL을 실행
	    	System.out.println("회원 정보를 저장했습니다.");

	    } catch (Exception e) {}
	}	
}

