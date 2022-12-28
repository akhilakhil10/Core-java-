package Task2;

import java.util.Scanner;


public class IfElseLeapYear {
	

	public static void main(String[] args) {

	   System.out.println("Enter the Year : ");
		
		Scanner s = new Scanner(System.in);
	
		int year = s.nextInt();
		
		
		if (year%4==0 && year%100!=0 || year%400==0) {
		
					
					System.out.println(year + " is a Leap Year");	
				}
				
			
		else {
			System.out.println(year + " is not a Leap Year");
				
	}
	s.close();
		
	}
	
}



