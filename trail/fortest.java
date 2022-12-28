package trail;

import java.util.Scanner;


public class fortest {

	public static void main(String[] args) {

		int a=3,b=5,c=0;
		
		  for (int i = 0; i<b; i++) {
			
	      c = c+a;	
	    
		  }
		
		  System.out.println(c);
		
		  int first = 0,second=1;
		
		 try( Scanner s = new Scanner(System.in)){
			 
		 
		
		  int t = s.nextInt();
		
		  for (int j=0 ; j<t ; j++) {
			
		  int third=first+second;
			
	      first=second;
	      
          second=third;
			
		  System.out.println(third);
			
		  }
		  
		  int z=1;
		  
		  int y =s.nextInt();
		  
		  for (int k = 1;k<=y; k++) {
			  
		  z=z*k;
		   
		  }
		  
		  System.out.println(z);
		  
		  System.out.println();
		  
		  int l =1;
		  
		  while(l<=y) {
			
		  System.out.println(l);	  
			  
		  l++;
		  
			  
			  
		  }}
		
	}

}
