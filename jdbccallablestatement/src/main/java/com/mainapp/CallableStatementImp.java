package com.mainapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementImp {
	
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:postgresql://localhost:5432/codehunt";
			String user = "postgres";
			String password = "Tiger";
			
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println(con);
			
			CallableStatement cs = con.prepareCall("{CALL xyz(?,?)}");
			
			cs.setString(1, "R%");
			cs.setInt(2, 10000);
			
			ResultSet rs = cs.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("fullname"));
				System.out.println(rs.getInt("salary"));
			}
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
