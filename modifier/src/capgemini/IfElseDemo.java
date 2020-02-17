package capgemini;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your value");
	int value=sc.nextInt();
	if(value==1) {
		System.out.println("Today is monday");	
	}
	else if(value==2) {
		System.out.println("Today is tuesday");	
	}
	else if(value==3) {
		System.out.println("Today is wednesday");	
	}
	else if(value==4) {
		System.out.println("Today is thursday");	
	}
	else if(value==5) {
		System.out.println("Today is friday");
}
	else if(value==6) {
		System.out.println("Today is saturday");
	}
		else if(value==7) {
			System.out.println("Today is sunday");
		}
	}
}