package practise;

		class A
		{
			A get()
			{
				return this;
			}
		}
		
		class encapsulationgetset extends A
		{
			encapsulationgetset get()
			{
				return this;
			}

			void message()
			{
			System.out.println("This is a test");
			}
		
		public static void main(String[] args) 
		{

			new encapsulationgetset().get().message();			
		}

		}



