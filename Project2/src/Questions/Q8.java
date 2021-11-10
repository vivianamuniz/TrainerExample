package Questions;

import java.util.ArrayList;

public class Q8 {

	public boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; ++i) {
			if (s.charAt(i) != s.charAt(s.length() - 1 -i))
				return false;
		}
		return true;
	}
	
	public void Palindrome() {
		
		ArrayList<String> palindromeCandidates = new ArrayList<String>();
		palindromeCandidates.add("karan");
		palindromeCandidates.add("madam");
		palindromeCandidates.add("tom");
		palindromeCandidates.add("civic");
		palindromeCandidates.add("radar");
		palindromeCandidates.add("jimmy");
		palindromeCandidates.add("kayak");
		palindromeCandidates.add("john");
		palindromeCandidates.add("refer");
		palindromeCandidates.add("billy");
		palindromeCandidates.add("did");
		
		ArrayList<String> palindromes = new ArrayList<String>();
		for (String s : palindromeCandidates) {
			if (isPalindrome(s))
				palindromes.add(s);
		}
		
		for (String s : palindromeCandidates)
			System.out.println(s + " ");
		
		for (String s : palindromes)
			System.out.println(s + " ");
		
	}
}
