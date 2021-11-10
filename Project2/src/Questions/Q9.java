package Questions;

import java.util.*;

public class Q9 {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		int i;
		
		for(i=1; i<=100; i++)
			list.add(i);
		
		for(int num: list) {
			for(i=2; i<num; i++) {
				if(num%i == 0)
					break;
			}
			if(i==num)
				System.out.print(num+ " ");
		}
	}
}
