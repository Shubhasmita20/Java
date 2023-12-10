package StringProgram;

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean isPalindrome(String s) {
		String rev ="";
		
		boolean ans = false;
		
		for(int i = s.length()-1; i>=0;i--) {
//			s.charAt(i);
			rev = rev+s.charAt(i);
		}
		
		if(s.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to check:  ");
		String word = sc.next();
		word = word.toLowerCase();
		System.out.println(isPalindrome(word));
		
	}

}
