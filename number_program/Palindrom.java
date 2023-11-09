package number_program;

import java.util.Scanner;
public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		isPalindrom(n);
		
	}
	public static void isPalindrom(int n) {
		int temp = n;
		int rev = 0;
		
		while(temp!=0) {
			int last = temp%10;
			rev = rev*10+last;
			temp=temp/10;
		}
		
		if (n == rev) {
			System.out.println(n+" is a Palindrome number");
		}
		else {
			System.out.println(n+" is not a Palindrome number");
		}
	}

}
