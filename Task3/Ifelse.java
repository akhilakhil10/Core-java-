package Task3;
import java.util.Scanner;
public class Ifelse 
{
	public static void main(String[] args)    
    {	
		String correctUserName = "Akhil";		
		int correctPin = 1234;	
		Scanner s = new Scanner(System.in);		
		String UserName;
		int UserPin;				
		System.out.println("Enter the User Name : ");		
		UserName = s.nextLine();				
		if (UserName.equals(correctUserName)) 			
        {			
			System.out.println("Enter the User Pin : ");		 
			UserPin = s.nextInt();			
			if (UserPin == correctPin) 									
				System.out.println("\nLogin Successful..");			           	
		    else 			
		    {
		    	System.err.println("User Pin Wrong  1st time...\n");		
		    	System.out.println("Please check and enter the pin again\n");				
		    	System.out.println("Re - Enter the User pin : ");				
		    	UserPin = s.nextInt();						
		    	if (UserPin == correctPin)			
		    	{			
		    		System.out.println("Login Successful..");			
		    	}		
		    		else				
		    		{							
		    			System.err.println("\nUser Pin Wrong 2nd time ...\n");				
		    			System.out.println("Please check and enter the pin again\n");				
		    			System.out.println("Re - Enter the User pin : ");				
		    			UserPin = s.nextInt();				
		    			if (UserPin == correctPin)
		    			{		
		    				System.out.println("\nLogin Successful..");			
		    			}				
		    				else 	    
		    				{				
		    					System.err.println("User Pin Wrong 3rd time ...\n");				
		    					System.err.println("Login Error\n");			
		    					System.err.println("User Has been blocked");		
		    				}
							s.close();
		    		}
		    }
        }			
		else 		
       {			
		System.err.println("\nUser Name is wrong..\n");			
		System.out.println("Please Check the User Name");
				
       }					
   }		
}
	
	
