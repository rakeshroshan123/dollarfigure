package arraysorting;

import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		char[] word = {'D','H','R','G','I','P','L'};
		System.out.println("values of array");
		for (int i=0;i<word.length;i++) {
			System.out.println(word[i]);
			
		}
		Arrays.sort(word);
		System.out.println("arrays.main()");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);
		}
		
		
	}
}
	