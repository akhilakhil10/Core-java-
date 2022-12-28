package Oops;

public class Zoo {


	public static void main(String[] args) {

Animal animal1 = new Bird("Lion",120,500);

 animal1.speak();

Bird bird1 = new Bird("pegion", 10, 3);



//fish1.speak();

//fish1.swim();

bird1.fly();
	
crow crow1=new crow("crow",10,2);
bird1.dance();
crow1.speak();
crow1.fly();

/*bird1.fly();

		
		Animal crow3=new crow("black crow", 5, 3);
		
		crow3.speak();
		Fish fish1=new Fish("Nemo", 3 , 30);
		
		
fish1.dance();
		crow crow1=new crow("crow",10,2);
		Fish fish1=new Fish("Nemo", 3 , 30);

		
moveAnimals(fish1);*/

	}
	
 
 public static void moveAnimals(Animal animal){
	
 animal.dance();
 
	
}
		


	}


