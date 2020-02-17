     package capgemini;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		int num;
		int flag=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Number");
	 num=scanner.nextInt();
	int curr=0;
	int curr1=0;
	int temp=0;
	while(num!=0) 
	{
		curr=num%10;
		temp=num/10;
		curr1=temp%10;
	if(curr1>curr){
		flag=1;
		break;
		}
	num/=10;
	}
 if(flag==1) {
	 System.out.println("false");
	
	 }
 else {
	 System.out.println("true");
 }
	}
	}

 
	
	

	


	


