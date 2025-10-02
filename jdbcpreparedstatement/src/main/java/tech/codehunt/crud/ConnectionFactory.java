package tech.codehunt.crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
		
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/codehunt";
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "Tiger";
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void close(AutoCloseable resource) {
		try {
			if(resource != null) {
				resource.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
