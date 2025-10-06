package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataExtraction {
		
	public static void main(String[] args) {
Connection con = null;
		
		try {
			String url = "jdbc:postgresql://localhost:5432/codehunt";
			String user = "postgres";
			String pass = "Tiger";
			con = DriverManager.getConnection(url,user,pass);
			
			String sql="select * from employee";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			
			int columnCount = metaData.getColumnCount();
			System.out.println(columnCount);
			
			for (int i = 1; i <= columnCount; i++) {
				System.out.println(metaData.getColumnName(i));
			}
			
			for (int i = 1; i <= columnCount; i++) {
				System.out.println(metaData.getColumnClassName(i));
			}
			
			for (int i = 1; i <= columnCount; i++) {
				System.out.println(metaData.getColumnDisplaySize(i));
			}
			
			System.out.println(metaData.getTableName(1));
			System.out.println(metaData.getCatalogName(1)); //Database name
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
