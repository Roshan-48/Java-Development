package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadOperation {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String user = "postgres";
			String password = "Tiger";
			
			Connection connection = DriverManager.getConnection(url,user,password);
			
			Statement st = connection.createStatement();
			
			String sql = "SELECT* FROM PERSON";
			st.execute(sql);
			
			ResultSet rs = st.getResultSet();
			
			while(rs.next()) {
				int getId = rs.getInt("id");
				String getName = rs.getString("name");
				int getAge = rs.getInt("age");
				
				System.out.println("Id : "+getId+" Name : "+getName+" Age : "+getAge);
			}
			connection.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
