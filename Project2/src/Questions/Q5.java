package Questions;

public class Q5 {

	public static String substring(String str, int idx) {
		String temp="";
		
		for(int itr=0; itr<idx; itr++) {
			temp=temp+str.charAt(itr);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		
		System.out.println(substring("DRISYAANMATHEW", 5));
	}
}
