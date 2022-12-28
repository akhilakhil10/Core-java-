package Oops;

public class Fish extends Animal{

	

	public Fish(String Name, int age, int weight) {
		super(Name, age, weight);
	}

	public void swim() {
		
		System.out.println("i am Swimming");
		
	}

	@Override
	public void dance() {

		System.out.println("hey i am dancing in water");
	}
	
}

