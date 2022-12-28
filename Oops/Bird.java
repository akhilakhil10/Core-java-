package Oops;

public class Bird extends Animal implements inter {
	
	
	public Bird(String Name, int age, int weight) {
		super(Name, age,  weight);
	}


	int age;
	String Name;
	int Weight;
	


	public void fly() {
		
		System.out.println("I am" + "Flying high");
		
	}



	@Override
	public void dance() {

		System.out.println("hey i am dancing");
	}




		
	}

