package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class DynamicInsertOperation {
	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/personcrud";
		String username = "postgres";
		String password = "Tiger";
		
		try {
			Connection conn = DriverManager.getConnection(url,username,password);
			
			String sql = "INSERT INTO PERSON VALUES(?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.print("How many records you want to insert :");
			int count = sc.nextInt();
			
			for (int i = 1; i <= count; i++) {
				System.out.print("Enter Id :");
				int id = sc.nextInt();
				System.out.print("Enter Name :");
				String name = sc.next();
				System.out.print("Enter Age :");
				int age = sc.nextInt();
				
				st.setInt(1, id);
				st.setString(2, name);
				st.setInt(3, age);
				
				st.execute();
				System.out.println(i+ " data inserted");
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}
