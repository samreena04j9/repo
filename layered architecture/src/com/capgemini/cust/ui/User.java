package com.capgemini.cust.ui;

import java.util.Scanner;

import com.capgemini.cust.bean.Customer;
import com.capgemini.cust.service.CustomerServiceImp;
import com.capgemini.cust.service.ICustomerService;

public class User {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ICustomerService service=new CustomerServiceImp();
		while(true) {
			System.out.println("welcome to cms");
			System.out.println("menu");
			System.out.println("1.add");
			System.out.println("2.Insert");
			System.out.println("3.Update");
			System.out.println("4.getCustomerByCid");
			System.out.println("5.getAllCustomerBycid");
			System.out.println("6.exit");
			System.out.println("enter your choice");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				
				System.out.println("Enter Customercid");
				int cid=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Customername");
				String name=scanner.nextLine();
				
				System.out.println("Enter Amount");
				double amount=scanner.nextDouble();
				
				Customer bean=new Customer();
				bean.setCid(cid);
				bean.setCustomername(name);
				bean.setAmount(amount);

				boolean isValid=CustomerServiceImp.userValidations(bean);
				
				System.out.println(isValid);
				
				if(isValid) {
					int count=service.addCustomer(bean);
					if(count>0) {
						System.out.println("record inserted");
					}
					else {
						System.out.println("not inserted");
					}
				}
				else {
					System.err.println("invalid input");
				}
		                                            		
			
			break;
			case 2:
					break;
			case 3:
					break;
			case 4:
					break;
			case 5:
					break;
			case 6:
				System.exit(0);
			default:
				System.out.println("invalid input");
					
	}		
		
	}
	}

	}


