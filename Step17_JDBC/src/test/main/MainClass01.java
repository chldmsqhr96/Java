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
public class MainClass01 {
	public static void main(String[] args) {
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
	    ResultSet rs = null;
	    
	    try {
	    	String sql = "SELECT num, name, addr"
	    			   + " FROM members "
	    			   + " ORDER BY num DESC";
	    	
	    	pstmt=conn.prepareStatement(sql);
	    	
	    	rs=pstmt.executeQuery();
	    	
	    	while(rs.next()) {
	    		int num = rs.getInt("num");
	    		String name = rs.getString("name");
	    		String addr = rs.getString("addr");
	    		System.out.println(num + " | " + name + " | " + addr);
	    	}
	    } catch (Exception e) {}
	}
}