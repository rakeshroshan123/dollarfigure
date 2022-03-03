package arraysorting;

import java.util.Arrays;

public class reverseorder {
	public static void main(String[] args) {
	char[] word = {'f','r','h','d'};
		System.out.println("values of array");
		for (int i=0;i<word.length;i++) {
			System.out.println(word[i]);
			
		}
		Arrays.sort(word);
		System.out.println("arrays.main()");
		for(int i=0;i<word.length;i++) {
			System.out.println(word[i]);

	}
	System.out.println("value of array afer sort in reverse");
	for(int i=word.length-1;i>=0;i++) {
		System.out.println(word[i]);
	}
	}


}
