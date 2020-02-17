package capgemini;

import java.util.Scanner;

public class Array1 {
                                                                                                                                                                                                                                                                                         
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int student[]= new int[5];
		//System.out.println(student.length);
		//System.out.println(student[2]);
		for (int i = 0; i < student.length; i++) {
			int value=scanner.nextInt();
			student[i]=value;
			System.out.println(student[i]);
			
		}
		for (int i : student) {
			System.out.println(i);
			
		} 
			
		
		
		
		
		
		
		
		
		
		/*int studentList[]=new int[4];
		studentList[0]=1508;
		System.out.println(studentList.length);
		System.out.println(studentList[0]);
		System.out.println(studentList[1]);
		System.out.println(studentList);	
*/
	}

}
