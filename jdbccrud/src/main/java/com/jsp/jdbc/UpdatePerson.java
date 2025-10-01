package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatePerson {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String user = "postgres";
			String password = "Tiger";
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("Connection: "+connection);
			
			Statement statement = connection.createStatement();
			
			String sql = "Update person SET age = 20 WHERE id = 103";
			
			statement.execute(sql);
			
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
