package co.micol.board.comm;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	private static DataSource dataSource;
	private String driver;
	private String url;
	private String user;
	private String password;
	private Connection conn;
	
	private DataSource() {
		getProperties();
	}
	
	public static DataSource getInstance() {
		dataSource = new DataSource();
		return dataSource;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패!!");
			e.printStackTrace();
		}
		return conn;
	}
	
	private void getProperties() {
		String resource = "/db.properties";
		Properties properties = new Properties();
		try {
			InputStream inputStream = getClass().getResourceAsStream(resource);
			properties.load(inputStream);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
