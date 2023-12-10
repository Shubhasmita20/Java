package StringProgram;

import java.util.*;

public class StringLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence: ");
		String str = sc.next();
		System.out.println(length(str));
	}
	
	public static int length(String str) {
		int len = str.length();
		return len;
		
	}

}
