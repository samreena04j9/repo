package capgemini;

public class Array2D {
	 
	public static void main(String[] args) {
		
		String empList[][]=new String[3][];
		empList[0]=new String[2];
		empList[1]=new String[3];
		empList[2]=new String[6];
		empList[0][0]="sabreen";
		empList[0][1]="samreen";
		empList[1][0]="saqlain";
		empList[1][1]="awais";
		empList[1][2]="umar";
		empList[2][0]="asim";
		empList[2][1]="ali";
		empList[2][2]="sabiya";
		empList[2][3]="saniya";
		empList[2][4]="afnan";
		empList[2][5]="irfan";
		
		for (String[] strings : empList) {
			for (String names : strings) {
				System.out.println(names);
			}
			
		}
		System.out.println(empList);
		
		
	}

}
