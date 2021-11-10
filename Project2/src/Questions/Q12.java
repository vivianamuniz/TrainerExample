package Questions;

public class Q12 {

	public static void main(String[] args) {
		
		int number[] = new int[100];
		
		for(int i=1; i<=100; i++) {
			number [i-1] = i;
		}
		
		for(int j:number) {
			if(j%2==0)
				System.out.println(j);
		}
	}
}
