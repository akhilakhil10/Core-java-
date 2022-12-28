package trail;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		
		
		int c=1;
		
		try (Scanner s = new Scanner (System.in)){
		
		int  t = s.nextInt();
		
		for (int i=1;i<=t;i++) {
			
		c = c*i;

	
		}
	

		System.out.println(c);
		
		
	}
	}
}
