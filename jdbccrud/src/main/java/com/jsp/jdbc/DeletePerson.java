package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletePerson {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String user = "postgres";
			String password = "Tiger";
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("Connection: "+connection);
			
			Statement st = connection.createStatement();
			String sql = "DELETE from person where id = 105";
			
			st.execute(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
