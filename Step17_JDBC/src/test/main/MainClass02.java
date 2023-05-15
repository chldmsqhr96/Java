package test.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * JDBC(Java DataBase Connectivity)
 * 
 * -database에 연결해서 select, insert, update, delete 작업
 * 
 * -oracle에 연결하기 위해서는 드라이버 클래스가 들어잇는 ojdbc6.jar파일을
 * 사용할 수 있도록 설정해야 한다
 * 
 * -프로젝트에 마우스 우클릭 => build path => configure build path =>
 *  librarys 선택 => classpath => add external jar => 파일 찾기 => apply
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=4;
		String name="주뎅이";
		String addr="봉천동";
		
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
	    	String sql = "INSERT INTO members"
	    			   + " (num, name, addr)"
	    			   + " VALUES(?, ?, ?)";
	    	
	    	//PreparedStatement를 통해 SQL을 전달하면서 객체의 참조값 얻기.
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	pstmt.setInt(1, num); // set(데이터타입)을 통해 해당 번째 COLUMN(열)에 위에서 선언된 변수(int num)를 대입 
	    	pstmt.setString(2, name);
	    	pstmt.setString(3, addr);
	    	
	    	pstmt.executeUpdate(); // SQL을 실행
	    	System.out.println("회원 정보를 저장했습니다.");

	    } catch (Exception e) {}
	}
}