package test.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private Connection conn;
	
	public DBConnect() {	
	    try {
		       Class.forName("oracle.jdbc.driver.OracleDriver");
		       String url="jdbc:oracle:thin:@localhost:1521:xe";
		       conn=DriverManager.getConnection(url, "scott", "tiger");
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
	}
	
	public Connection getConn() {
		return conn;
	}
}