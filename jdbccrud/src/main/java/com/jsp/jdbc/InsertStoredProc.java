package com.jsp.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertStoredProc {
	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/personcrud";
		String user = "postgres";
		String password = "Tiger";
		
		try (Connection con = DriverManager.getConnection(url,user,password);){
			
			System.out.println(con);
			
			CallableStatement cs = con.prepareCall("CALL person_account(?,?,?)");
			
			cs.setInt(1, 1003);
			cs.setString(2, "Test");
			cs.setInt(3, 25);
			
			cs.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
