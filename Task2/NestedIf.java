package Task2;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		System.out.println("Enter Year : ");
		
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		if(year%4==0) {
			
		if (year%100!=0) {
				
		if (year%400==0) {
					
		System.out.println(year + "  is a Leap Year");
					
		}else {
		
		System.out.println(year + "  is  a Leap Year");	
			
		}
		}else {
		
		System.out.println(year + "  is a Leap Year");	
			
		}
		}else {
			
	    System.out.println(year + "  is not a Leap Year");
	
		
		}
		s.close();
	}

}
