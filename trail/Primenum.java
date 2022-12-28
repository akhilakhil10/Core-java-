package trail;

import java.util.Scanner;


public class Primenum {
	
	

	public static void main(String[] args) {

	int i,a=0,b=0;
	
	Scanner s =new Scanner(System.in);
	
	int A=s.nextInt();
	
	a=A/2;
	s.close();
	if(A==0||A==1){
		
		
	System.out.println(A + " is not prime number " );
	
	
	} else {
		
	for ( i=2;i<=a;i++) 
	{
		if (A%i==0) 
		{
				System.out.println(A + " is not a prime number");
				
				b=1;
				break;
				
		}
	}
					if (b==0) 
					{
						System.out.println(A + " is prime number");
					}
					
					s.close();
				}
			}
		
		}    
		
	



