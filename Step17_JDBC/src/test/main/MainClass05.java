package test.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		int num = 4;
		Connection conn=null;
		
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
	    	String sql = "DELETE FROM members"
	    			   + " WHERE num=?";
	    	
	    	//PreparedStatement를 통해 SQL을 전달하면서 객체의 참조값 얻기.
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	pstmt.setInt(1, num);
	    	
	    	pstmt.executeUpdate(); // SQL을 실행
	    	System.out.println("회원 정보를 저장했습니다.");

	    } catch (Exception e) {}
	}	
}