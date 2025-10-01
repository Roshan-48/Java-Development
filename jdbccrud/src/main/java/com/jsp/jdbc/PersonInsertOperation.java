package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PersonInsertOperation {
	public static void main(String[] args) {	
		try {
			//1.load Driver class(Provided fully qualified name)
			Class.forName("org.postgresql.Driver");
			
			//2.Establish Connection
			String url = "jdbc:postgresql://localhost:5432/personcrud";
			String user = "postgres";
			String password = "Tiger";
			Connection connection = DriverManager.getConnection(url,user,password);
			System.out.println("Connection: "+connection);
			
			//3.Create Statement
			Statement st = connection.createStatement();
			String sql = "INSERT INTO person Values(101,'Roshan',23)";
			String sql1 = "INSERT INTO person Values(102,'Harshal',22)";
			String sql2 = "INSERT INTO person Values(103,'Pratik',20)";
			String sql3 = "INSERT INTO person Values(104,'Lokesh',24)";
			String sql4 = "INSERT INTO person Values(105,'Vaibhav',22)";
			
			//4.Execute Statement
			st.execute(sql);
			st.execute(sql1);
			st.execute(sql2);
			st.execute(sql3);
			st.execute(sql4);
			
			//5.Close the Connection
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
