package capgemini;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {                                                                                                                                                                                                                                                                                                                                                     
		int num;
		int flag=0,s=1;
		Scanner scanner=new Scanner(System.in);
	  num=scanner.nextInt();
		while(s<num)
	
			s=s*2;
		
		if(s==num) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
	}

}
