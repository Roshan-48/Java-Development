package tech.codehunt.logic;

import java.util.Scanner;

import tech.codehunt.crud.Crud;
import tech.codehunt.dto.EmployeeDTO;

public class Logic {
		
	private final int INSERT_DATA = 1;
	private final int READ_DATA = 2;
	private final int UPDATE_DATA = 3;
	private final int DELETE_DATA = 4;
	private final int TEST_DATA = 5;
	private final int EXIT = 6;
	
	private static final int MAX_ATTEMPTS = 3;
	private String username;
	private String password;
	private String fullname;
	private String address;
	private int salary;
	private Crud crud;
	
	public Logic() {
		crud = new Crud(); //Composition concept
	}
	
	public void doStart() {
		Scanner sc = new Scanner(System.in);
		int attempt = 0;
		
		while(true) {
			System.out.println("\n************************MENU*********************");
			System.out.println("Press-1 : INSERT DATA");
			System.out.println("Press-2 : READ DATA");
			System.out.println("Press-3 : UPDATE DATA");
			System.out.println("Press-4 : DELETE DATA");
			System.out.println("Press-5 : Test Data");
			System.out.println("Press-6 : EXIT\n");
			
			System.out.println("Enter your choice: ");
			int choice = 0;
			
			try {
				choice = sc.nextInt();
			}catch(Exception e) {
				System.out.println("Invalid Input! Please take a number from 1 to 6.\n");
				sc.nextLine();
				
				attempt++;
				if(attempt >= MAX_ATTEMPTS) {
					System.out.println("You have reached the limit");
					sc.close();
					return;
				}
				continue;
			}
			if(choice < 1 || choice > 6) {
				System.out.println("Invalid Input! Please take a value from 1 to 5.\n");
				attempt++;
				if(attempt >= MAX_ATTEMPTS) {
					System.out.println("You have reached the limit");
					sc.close();
					return;
				}
			}
			
			switch(choice) {
			
			case INSERT_DATA:
				System.out.println("******************INSERT*********************");
				
				System.out.println("Enter USERNAME");
				username = sc.next();
				
				System.out.println("Enter PASSWORD");
				password = sc.next();
				
				sc.nextLine();
				
				System.out.println("Enter FULLNAME");
				fullname = sc.nextLine();
				
				System.out.println("Enter ADDRESS");
				address = sc.nextLine();
				
				System.out.println("Enter SALARY");
				salary = sc.nextInt();
				
				EmployeeDTO employeeDTO = new EmployeeDTO(username, password, fullname, address, salary);
				
				crud.insert(employeeDTO);
				break;
				
			
			case READ_DATA:
				System.out.println("**********************READ*************************");
				
				System.out.println("Enter USERNAME");
				username = sc.next();
				
				System.out.println("Enter PASSWORD");
				password = sc.next();
				
				crud.read(username, password);
				break;
				
				
			case UPDATE_DATA:
				System.out.println("**********************UPDATE*************************");
				
				System.out.println("Enter USERNAME");
				username = sc.next();
				
				System.out.println("Enter SALARY");
				salary = sc.nextInt();
				
				crud.update(username, salary);
				break;
			
			
			case DELETE_DATA:
				System.out.println("**********************DELETE*************************");
				
				System.out.println("Enter USERNAME");
				username = sc.next();
				
				crud.delete(username);
				break;
				
				
			case TEST_DATA:
				System.out.println("********************TEST DATA*************************");
				String sql1 = "Select*from employee";
				String sql2 = "Insert into employee(username,password,fullname,address,salary)"+"values('test','test123','testname','testadd',2000)";
	
				System.out.println("P1->SELECT\nP2->NON SELECT");
				choice = sc.nextInt();
				if(choice==1) {
					crud.test(sql1);
				}
				else {
					crud.test(sql2);
				}
				break;
				
				
			case EXIT:
				System.out.println("EXIT");
				sc.close();
				return;
			}
		}
	}
}
