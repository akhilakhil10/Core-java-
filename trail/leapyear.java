package trail;

import java.util.Scanner;

public class leapyear 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the starting year: ");
		
		int startYear = input.nextInt();

		System.out.println("Enter the ending year: ");
		
		int endYear = input.nextInt();

		for (int i = startYear; i <= endYear; i++) 
		{
		if (i % 4 == 0) {
			
		if (i % 100 == 0) {
			
		if (i % 400 == 0) {
			
		System.out.println(i + " is a leap year");
		
		}
		
		} else {
			
		System.out.println(i + " is a leap year");
		
	    }
	    
	
		}
	
		}
		input.close();
		
	}
}


