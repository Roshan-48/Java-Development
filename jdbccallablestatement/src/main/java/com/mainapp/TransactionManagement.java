package com.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionManagement {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		
		try {
			String url = "jdbc:postgresql://localhost:5432/codehunt";
			String user = "postgres";
			String password = "Tiger";
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println(con);
			
			con.setAutoCommit(false);
			
			String sql = "update employee set salary = ? where username = 'Roshan'";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			System.out.print("Enter new Salary: ");
			ps.setInt(1, sc.nextInt());
			int executeUpdate1 = ps.executeUpdate();
			System.out.println(executeUpdate1);
			
			System.out.print("Enter new Salary: ");
			ps.setInt(1, sc.nextInt());
			int executeUpdate2 = ps.executeUpdate();
			System.out.println(executeUpdate2);
			
			System.out.print("Enter new Salary: ");
			ps.setInt(1, sc.nextInt());
			int executeUpdate3 = ps.executeUpdate();
			System.out.println(executeUpdate3);
			
			con.commit();
			
		} catch (SQLException e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
}
