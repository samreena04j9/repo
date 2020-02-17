package capgemini;

import java.util.Scanner;

public class MenuDemo {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the menu");
		System.out.println("1.dosa");
		System.out.println("2.idili");
		System.out.println("3.pizza");
		System.out.println("4.burger");
		System.out.println("5.biryani");
		System.out.println("enter your choice");
		int menu=scan.nextInt();
		switch (menu) {
		case 1:
			System.out.println("dosa");
			break;
		case 2:
			System.out.println("idli");
				break;
		case 3:
			System.out.println("pizza");
				break;
		case 4:
			System.out.println("burger");
				break;
		case 5:
			System.out.println("biryani");
			break;
			default:
				System.out.println("invalid input");
				break;
			
		}

	}

}
