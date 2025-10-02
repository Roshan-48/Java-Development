package tech.codehunt.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tech.codehunt.dto.EmployeeDTO;

public class Crud {
		
	public Crud() {
		createTable();
	}
	
	public void createTable() {
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection = ConnectionFactory.getConnection();
			String sql = "CREATE TABLE IF NOT EXISTS employee (sn SERIAL PRIMARY KEY,"+
						"USERNAME varchar(30) NOT NULL UNIQUE,"+ 
						"PASSWORD varchar(30),"+ "FULLNAME varchar(50),"+
						"ADDRESS varchar(100)," + "SALARY int)";
			
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			System.out.println("Table Created");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.close(statement);
			ConnectionFactory.close(connection);
		}
	}
	
	
	public void insert(EmployeeDTO employeeDTO) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			String sql = "insert into employee(username,password,fullname,address,salary)values(?,?,?,?,?)";
			connection = ConnectionFactory.getConnection();
			
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, employeeDTO.getUsrename());
			preparedStatement.setString(2, employeeDTO.getPassword());
			preparedStatement.setString(3, employeeDTO.getFullname());
			preparedStatement.setString(4, employeeDTO.getAddress());
			preparedStatement.setInt(5, employeeDTO.getSalary());
				
			int rows = preparedStatement.executeUpdate();
				if (rows > 0) {
			        System.out.println("Data Inserted");
			    }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.close(preparedStatement);
			ConnectionFactory.close(connection);
		}
	}
	
	
	public void read(String username, String password) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			String sql = "select * from employee where username= ? and password= ?";
			
			connection = ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				int getSn = resultSet.getInt("sn");
				String getUsername = resultSet.getString("username"); 
				String getPassword = resultSet.getString("password");
				String getFullname = resultSet.getString("fullname"); 
				String getAddress = resultSet.getString("address");
				int getSalary = resultSet.getInt("salary");
				
				System.out.println("SN: " + getSn);
				System.out.println("USERNAME: " + getUsername); 
				System.out.println("PASSWORD: " + getPassword); 
				System.out.println("FULLNAME: " + getFullname); 
				System.out.println("ADDRESS: " + getAddress); 
			    System.out.println("SALARY: " + getSalary);
			}
			else {
				System.out.println("USER NOT FOUND");
			}
		} catch (SQLException e) { 
			   e.printStackTrace();
		}finally {
			ConnectionFactory.close(resultSet);
			ConnectionFactory.close(preparedStatement); 
			ConnectionFactory.close(connection); 
		}
	}
	
	
	public void update(String username, int salary) {
		Connection connection = null; 
		PreparedStatement preparedStatement = null;
		
		try {
			String sql = "update employee set salary = ? where username = ?"; 
			connection = ConnectionFactory.getConnection(); 
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, salary);
			preparedStatement.setString(2, username);
			
			int executeUpdate = preparedStatement.executeUpdate(); 
			
			if (executeUpdate > 0) { 
				System.out.println("DATA UPDATED"); 
			} 
			else { 
				System.out.println("USER NOT FOUND"); 
			} 
 
		}catch (SQLException e) { 
			 e.printStackTrace(); 
		} finally { 
			ConnectionFactory.close(preparedStatement); 
			ConnectionFactory.close(connection); 
		}
	}
	
	
	
	public void delete(String username) {
		Connection connection = null; 
		PreparedStatement preparedStatement = null;
		
		try {
			String sql = "delete from employee where username= ?"; 
			connection = ConnectionFactory.getConnection(); 
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, username);
			
			int executeUpdate = preparedStatement.executeUpdate(); // NO DATA 
			
			if (executeUpdate > 0) { 
				System.out.println("DATA DELETED"); 
			} 
			else { 
				System.out.println("USER NOT FOUND"); 
			} 
 
		}catch (SQLException e) { 
			 e.printStackTrace(); 
		} finally { 
			ConnectionFactory.close(preparedStatement);; 
			ConnectionFactory.close(connection); 
		}
	}
	
		
	public void test(String sql) {
		Connection connection = null;
		PreparedStatement preparedStatement =null;
		
		try {
			connection = ConnectionFactory.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			
			boolean execute = preparedStatement.execute();
			
			if(execute) {
				ResultSet resultSet = preparedStatement.getResultSet();
				
				if(resultSet.next()) {
					int getSn = resultSet.getInt("sn");
					String getUsername = resultSet.getString("username");
					String getPassword = resultSet.getString("password");
					String getFullname = resultSet.getString("fullname");
					String getAddress = resultSet.getString("address");
					int getSalary = resultSet.getInt("salary");
					
					System.out.println("SN: " + getSn);
					System.out.println("USERNAME: " + getUsername); 
					System.out.println("PASSWORD: " + getPassword); 
					System.out.println("FULLNAME: " + getFullname); 
					System.out.println("ADDRESS: " + getAddress); 
				    System.out.println("SALARY: " + getSalary);
				}else {
					System.out.println("USER NOT FOUND");
				}
			}
			else {
				int k = preparedStatement.getUpdateCount();
				System.out.println(k);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
			ConnectionFactory.close(preparedStatement);
			ConnectionFactory.close(connection);
		}
	}
}
