package exceptiondemo;

public class ExpDemo {

	public static void main(String[] args) {
		int res=0;
		System.out.println("Open file");
		System.out.println("Write data");
		try {
		 res =ExpDemo.div(10,0);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			System.err.println(res);
		
		}
		finally
		{
			System.out.println("closed");
		}
	System.out.println(res);
      System.out.println("Close file");
		System.out.println("Thank u ");
	}
	public static int div(int a,int b)throws ArithmeticException {
		return a/b;
		
	}

}
