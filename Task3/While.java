package Task3;
import java.util.Scanner;
public class While
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String UserName,CorrectUserName = "Akhil";
		int UserPin,CorrectUserPin = 1234,i;
		System.out.println("Enter the User Name : ");
		UserName=s.nextLine();
		if(UserName.equals(CorrectUserName))
		{
		
			i=0;
			while(i<3)
			{	
				if(i==0) 
				{
					System.out.println("Enter the User Pin : ");
				}
				else
				{
					System.out.println("Re-Enter the User Pin : \n");
				}
					UserPin=s.nextInt();
				
			if(UserPin == CorrectUserPin)
			{
				System.out.println("\nLogin Successful.....");
				break;
			}	
			else
			{
				System.err.println("User Pin is Wrong...\n" + "Count "+ (i+1));
			
			}
			
			i++;
			s.close();
			}
			if(i==3)
			{
				System.out.println("\nUser Has been Blocked...");
			}
		}
		else
		{
			System.err.println("\nUser Name is Wrong...");
			System.out.println("\nPlease Check the User Name....");
			
		}
		
		}

}
