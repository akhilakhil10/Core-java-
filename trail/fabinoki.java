package trail;
import java.util.Scanner; 
public class fabinoki {

	public static void main(String[] args) {
		
		int first=0;
		int second=1;
	
		try (Scanner s = new Scanner (System.in)) {
		
		int t = s.nextInt();
		
		for (int i=0;i<t;i++) {
			
			int third=first+second;
			
			System.out.println(third);
			
			first = second;
			second = third;
			
		
			
			
			}
	
		}
		
		
	}
			
		}
			
		
		
		

	


