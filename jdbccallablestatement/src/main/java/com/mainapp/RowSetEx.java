package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:postgresql://localhost:5432/codehunt";
		String user = "postgres";
		String pass = "Tiger";
		
		try(Connection con = DriverManager.getConnection(url,user,pass);) {
			
			System.out.println(con);
			
			PreparedStatement ps = con.prepareStatement("Select* from employee");
			
			ResultSet rs = ps.executeQuery();
			
			CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
			cachedRowSet.populate(rs);
			
			while(cachedRowSet.next()) {
				int sn = cachedRowSet.getInt("sn");
				String fullname = cachedRowSet.getString("fullname");
				
				if(fullname.equals("testname")) {
					cachedRowSet.deleteRow();
				}
				else {
					System.out.println(sn);
					System.out.println(fullname);
				}
			}
			sc.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
