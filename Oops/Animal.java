package Oops;

public abstract class Animal  {
	
	int age ;
	int  weight;
	String Name;
	String Gender;
	
	public Animal ( String Name, int age,  int weight) {
		
		this.age = age;
		this.weight=weight;
		this.Name=Name;
		
		
		
	}

	public void eat() {
		
		System.out.println("i am Eating ...");
		
		
	}
	
	public abstract void dance();
	
	
	public void sleep() {
		
		System.out.println("i am Sleeping... Do not DIsturb");
	}
	
	public void speak() {
		
		System.out.println("i am " + Name);
		System.out.println("My Weight is " + weight + " Kgs");
		System.out.println("i am " + age + " years old\n");
		
		
	}
	
}
