package Questions;

import Questions.Q7;

public class Driver {
//Question 1
	public static void main(String args[]) {
		Q1 ob = new Q1();
		int arr[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		ob.Q1(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	
//Question 2
		System.out.println(" ");
		Q2 q2 = new Q2();
		q2.main(args);
//Question 3 ( This code output is printed directly after the Fibonacci numbers
		System.out.println(" ");
		Q3 q3 = new Q3();
		q3.main(args);
		   
//Question 4
		System.out.println(" ");
		 Q4 q4 = new Q4();
		 q4.main(args);
		    
//Question 5
		 System.out.println(" ");
		 Q5 q5 = new Q5();
		 q5.main(args);
//Question 6
		System.out.println(" ");
		Q6 q6 = new Q6();
		q6.main(args);
//Question 7
		System.out.println(" ");
		Q7 q7 = new Q7();
		q7.Compare();
//Question 8
		System.out.println(" ");
		Q8 q8 = new Q8();
		q8.Palindrome();
//Question 9
		System.out.println(" ");
		Q9 q9 = new Q9();
		q9.main(args);
//Question 10 (printed out directly after Question 9 answer)
		System.out.println(" ");
		Q10 q10 = new Q10();
		q10.main(args);
//Question 11
		System.out.println(" ");
		Q11 q11 = new Q11();
		q11.main(args);
//Question 12 
		System.out.println(" ");
		Q12 q12 = new Q12();
		q12.main(args);
//Question13
		System.out.println(" ");
		Q13 q13 = new Q13();
		q13.main(args);
//Question14
		System.out.println(" ");
		Q14.SwitchCases(1);
		Q14.SwitchCases(2);
		Q14.SwitchCases(3);
//Question15
		System.out.println(" ");
		Q15 q15 = new Q15();
		q15.Interfaces();
//Question16
		//Q16.Count(args[0]);
		//if(args.length > 0)
			//System.out.println(args[0].length());
//Question17
		Q17 q17 = new Q17();
		q17.CalculateInterest();
//Question18
		System.out.println(" ");
		Q18Subclass q18 = new Q18Subclass();
		System.out.println(q18.hasUppercaseLetter("Viviana"));
		System.out.println(q18.hasUppercaseLetter("zebra"));
		System.out.println(q18.hasUppercaseLetter("the quick brown fox jumps over the lazy dog"));
		System.out.println(q18.hasUppercaseLetter("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		System.out.println(q18.toUpperCase("the quick brown fox jumps over the lazy dog"));
		
		System.out.println(q18.stringToInt("Viviana"));
//Question19
		System.out.println(" ");
		Q19 q19 = new Q19();
		q19.main(args);
//Question20
		System.out.println(" ");
		Q20 q20 = new Q20();
		q20.loadData();
		}
	}


