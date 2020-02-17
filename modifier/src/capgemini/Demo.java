package capgemini;

public class Demo {

	public static void main(String[] args) {
		 Object obj1=new Object();
		 Object obj2=obj1;
		 System.out.println(obj1.hashCode());
		 System.out.println(obj1.toString());
		 System.out.println(obj2.equals(obj1));  
	}

}
 