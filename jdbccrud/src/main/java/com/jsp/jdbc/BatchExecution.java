package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecution {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		
		try {
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String user = "postgres";
			String password = "Tiger";
			
			con = DriverManager.getConnection(url,user,password);
			con.setAutoCommit(false);
			System.out.println(con);
			
			Statement st = con.createStatement();
			
			String sql1 = "INSERT INTO person VALUES(107, 'Roshan', 23)";
			st.addBatch(sql1);
			
			String sql2 = "INSERT INTO person VALUES(108, 'Lokesh', 25)";
			st.addBatch(sql2);
			
			String sql3 = "INSERT INTO person VALUES(109, 'Vaibhav', 22)";
			st.addBatch(sql3);
			
			String sql4 = "INSERT INTO person VALUES(110, 'Suyash', 21)";
			st.addBatch(sql4);
			
			st.executeBatch();
			
			System.out.println("Data Inserted....!");
			
			con.commit(); 
			
		} catch (SQLException e) {
			
			if (con != null) {
		        con.rollback();
		    }
		    e.printStackTrace();
		}finally {
			if (con != null) {
		        con.close();
		    }
		}
	}
}
