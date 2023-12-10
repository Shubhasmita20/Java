package StringProgram;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverseString(String s) {
		String rev ="";
		
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String word = sc.next();
		word = word.toLowerCase();
		System.out.println("Reversed: "+reverseString(word));
	}

}
