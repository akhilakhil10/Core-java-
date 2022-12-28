package Task2;

import java.util.Scanner;

public class IfElseVoterId {

	public static void main(String[] args) {

		System.out.println("Enter the Name of The Person : ");
		
		Scanner s = new Scanner(System.in);
		
		String Name = s.next();
		
		System.out.println("Enter the Person Age : ");
		
		int Age = s.nextInt();
		
		if (Age >=18) {
			
			System.out.println(Name + " is Eligible for Vote");
		}
		
		else {
			
			System.out.println(Name + " is Not Eligible for Vote");
		}
		s.close();
	}

}
