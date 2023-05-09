package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	// 싱글톤 패턴으로 작성
	private static DatabaseConnector dbc = new DatabaseConnector();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
	
	private DatabaseConnector() {
		try {
			// 드라이버 로드
			Class.forName(jdbcDriver);		
			// connection 하기 위한 정보 : url, user, password
			conn = DriverManager.getConnection(jdbcUrl, "javauser", "mysql");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결정보가 올바르지 않습니다.");
			e.printStackTrace();
		}
	}
	
	public static DatabaseConnector getInstance() {
		return dbc;
	}
	
	public Connection getConnection() {
		return conn;
	}
}
