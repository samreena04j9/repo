package exceptiondemo;

public class ChkException {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome");
			Thread.sleep(2000);
			System.out.println("samreen"); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
