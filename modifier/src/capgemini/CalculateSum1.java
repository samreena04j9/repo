package capgemini;

import java.util.Scanner;

public class CalculateSum1 {
	public static int total(int num)
	{
		  int sum=0;
		  for(int i=1;i<=num;i++)
		  {
			  if(i%3==0 || i%5==0)
			  sum=sum+i;
		  }
		  return sum;
	}
 public static void main(String[] args)
 {
	Scanner sc=new Scanner(System.in); 
	System.out.println("enter the number");
	int num=sc.nextInt();
	int sum=total(num);
	System.out.println("sum of which are  divisble by 3 and 5 :"+sum);
	 
 }
}
