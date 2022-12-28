package practise;


	

abstract class akhil {
	
	abstract void go();

}

class abstractp extends akhil {

	void go() {
		System.out.println("Sri Akhil Reddy");
		
	}

	public static void main(String[] args) {

		akhil object = new abstractp();
		object.go();
		
	}
}




