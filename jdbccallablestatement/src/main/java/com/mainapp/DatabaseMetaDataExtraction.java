package com.mainapp;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetaDataExtraction {
	public static void main(String[] args) {
			
		Connection con = null;
		
		try {
			String url = "jdbc:postgresql://localhost:5432/codehunt";
			String user = "postgres";
			String pass = "Tiger";
			con = DriverManager.getConnection(url,user,pass);
			
			DatabaseMetaData metaData = con.getMetaData();
			
			System.out.println(metaData.getURL());
			System.out.println(metaData.getUserName());
			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDatabaseProductVersion());
			System.out.println(metaData.getDatabaseMajorVersion());
			System.out.println(metaData.getDatabaseMinorVersion());
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getDriverVersion());
			System.out.println(metaData.getDriverMajorVersion());
			System.out.println(metaData.getDriverMinorVersion());
			System.out.println(metaData.getMaxUserNameLength());
			System.out.println(metaData.getMaxColumnsInTable());
			System.out.println(metaData.getMaxRowSize());
			
			
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
