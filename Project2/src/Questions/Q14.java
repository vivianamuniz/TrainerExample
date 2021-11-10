package Questions;

import java.time.LocalDate;

public class Q14 {
	
	public static void SwitchCases(int option) {
		
		int aNumber = 144;
		
		switch (option) {
		case 1:
			System.out.println("The square root of " + aNumber + " is " + Math.sqrt(aNumber));
			break;
			
		case 2:
			System.out.println("Today's date is " + LocalDate.now());
			break;
			
		case 3:
			String s = "I am Learning Core Java";
			String sArray [] = s.split(" ");
			for(String token:sArray) {
				System.out.println(token);
				
			}
			break;
			default:
				break;
		}
		
	}

}
