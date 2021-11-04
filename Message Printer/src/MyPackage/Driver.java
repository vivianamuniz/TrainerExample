package MyPackage;

public class Driver {

	public static void main(String[] args) {
		String myMessage = "Hello!"; // String Literal - Manually entered value
		int runIterations = 5;
		
		// For Loop
		for (int i = 0; i < runIterations; ++i) {
			System.out.println(myMessage + ": " + i);
			
		//While Loop
			int j = 0;
			while (j < runIterations)
			{
				System.out.println("J is still going! J = " + j);
				++j;
			}
			boolean done = false;
			while (!done) { 
				System.out.println("Still not done!");
				
				if (j % 12 == 0)
					done = true;
				//Infinite Loop
			}
			// While Loops 
			// For Loops
			do {
			}while
			
		}
		
	}
	
}
