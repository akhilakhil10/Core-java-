package Task3;
import java.util.Scanner;
public class Forloop 
{
	public static void main(String[] args) 
	{
		String CorrectUserName = "Akhil", UserName;
		int CorrectUserPin = 1234, UserPin,i;
		System.out.println("Enter User Name : ");
		Scanner s = new Scanner(System.in);
		UserName = s.nextLine();
			if(UserName.equals(CorrectUserName)) 
			{
				
				
				for(i = 0 ; i<3 ; i++) 	
				{
					if(i==0)
					{
					System.out.println("\nEnter The User Pin : \n");
					}
					else
					{
						System.out.println("\nRe-Enter the User Pin ");
						
					}
					UserPin = s.nextInt();
					if(UserPin == CorrectUserPin) 
					{	
						System.out.println("\nLogin Successful...\n");						
						break;
					}
					else	
					{
						System.err.println("\nUser Pin is Wrong...\n" + "Count " + (i+1));
						
					}
					s.close();
				}
				if(i==3)
				{				
				System.err.println("\nUser is Blocked....\n");
				}
			}
				else
				{
					System.err.println("User Name Wrong ...\n");
					System.out.println("Please Check the User Name and try again...\n");
					
				}

				
	}		
}	
	


