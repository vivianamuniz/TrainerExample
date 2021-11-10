package Questions;
public class Q3 {
	static String reversingString(char[]str, int start, int end) {
		while (start < end) {
			str[start] ^= str[end];
			str[end] ^= str[start];
			str[start] ^= str[end];
			
			++start;
			--end;
		}
		return String.valueOf(str);
	}
	public static void main(String[] args)
	{
	    String s = "ReversingString";
	    System.out.println(reversingString
	                      (s.toCharArray(), 0, 14));
	}

}
