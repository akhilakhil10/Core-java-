package Task2;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		System.out.println("Enter the number of times to be Printed : ");
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		int i=1;
		
		do {
			
	    System.out.print("Akhil ");
			
	    i++;
			
			
		}while(i<=a);
		
		
		s.close();
		
	}

}
