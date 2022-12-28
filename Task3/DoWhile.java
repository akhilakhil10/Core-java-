package Task3;
import java.util.Scanner;
public class DoWhile
{
	public static void main(String[] args)
	{
		String UserName,CorrectUserName= "Akhil";
		int UserPin, CorrectUserPin = 1234, i;
		System.out.println("Enter the User Name : ");
		Scanner s = new Scanner(System.in);

		UserName= s.nextLine();
		if(UserName.equals(CorrectUserName))
		{
			
		
			i=0;
			do
			{	
			if(i==0)
			{
				System.out.println("Enter the User Pin : ");
			}
			else
			{
				System.out.println("\nRe-Enter the User Pin : \n");
			}
			UserPin=s.nextInt();
			if(UserPin ==CorrectUserPin) 
			{
				System.out.println("Login Successful...");	
				break;	
			}
			else
			{
				System.err.println("Entered Pin is Wrong...\n\n"+ "Count " + (i+1) );
			}
			i++;
			}
			while(i<3);
			if(i==3) 
			{
			
				System.out.println("\nUser has been Blocked");
			}
		}
		else
		{
			System.err.println("Entered User Name is Wrong...\n");
			System.out.println("Please Check the User Name and Try Again...");
		}
		
		s.close();
	}

}
