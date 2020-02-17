package capgemini;

import java.util.Scanner;

public class Exercise2 {
	public static int CalculateDifference (int n)
	{
		n=Math.abs(n);
		return SumOfSquare(n)- SquareOfSum(n);
		
	}
	public static int SumOfSquare(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*i;
		
		}
		return sum;
	}
  public static int SquareOfSum( int n)
  {
	int sum=0;
	for(int i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	return sum*sum;
  }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("the value of n is : ") ;
    int n=sc.nextInt();
    int diff=CalculateDifference(n);
    System.out.println(diff);
	}

}
