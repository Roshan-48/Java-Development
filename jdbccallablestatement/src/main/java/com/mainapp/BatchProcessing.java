package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessing {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		
		try {
			String url = "jdbc:postgresql://localhost:5432/codehunt";
			String user = "postgres";
			String pass = "Tiger";
			
			con = DriverManager.getConnection(url,user,pass);
			con.setAutoCommit(false);
			System.out.println(con);
			
			String sql = "insert into employee(username,password,fullname,address,salary) values(?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			while(true) {
				
				System.out.println("Enter USERNAME");
				String username = sc.next();
				
				System.out.println("Enter PASSWORD");
				String password = sc.next();
				
				sc.nextLine();
				
				System.out.println("Enter FULLNAME");
				String fullname = sc.nextLine();
				
				System.out.println("Enter ADDRESS");
				String address = sc.nextLine();
				
				System.out.println("Enter SALARY");
				int salary = sc.nextInt();
				
				ps.setString(1, username);
				ps.setString(2, password);
				ps.setString(3, fullname);
				ps.setString(4,address);
				ps.setInt(5, salary);
				
				ps.addBatch();
				
				System.out.println("Do you want more to insert : (Y)");
				String choice = sc.next().trim().toLowerCase();
				
				if(!choice.equals("Y")) {
					int[] i = ps.executeBatch();
					
					System.out.println("Rows Inserted : "+i.length);
					con.commit();
					sc.close();
					break;
				}
			}
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
