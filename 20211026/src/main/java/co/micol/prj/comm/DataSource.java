package co.micol.prj.comm;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource { //전형적인 싱글톤 클래스 
	private static DataSource dataSource; // 생성자나 변수를 private으로 정의하고
	private DataSource() {
		getProperties();
		}				// instance만 public으로 외부에 뿌림
	
	private String driver;
	private String url;
	private String user;
	private String password;
	
	private Connection conn;
	
	public static DataSource getInstance() {
		dataSource = new DataSource();
		return dataSource;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user,password);
		}catch(ClassNotFoundException | SQLException e) {
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
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
