package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClosing {
	
	public static void main(String[] args) {
		Connection con = null;
		
		String url = "jdbc:postgresql://localhost:5432/personcrud?user=postgres&password=Tiger";
		
		try {
			con = DriverManager.getConnection(url);
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}finally {
			System.out.println("Connection : "+con);
			
			try {
				if(con != null) {
					con.close();
				}else {
					System.out.println("Connection is not created");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
