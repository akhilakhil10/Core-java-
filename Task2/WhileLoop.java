package Task2;

import java.util.Scanner;


public class WhileLoop {

	public static void main(String[] args) {

		System.out.println("Enter the no of times to be Printed: ");
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		int i=1;
		
		while(i<=a) {
			
			System.out.print("Akhil ");
			
			i++;
			
		}
		
		s.close();
		
	}

}
