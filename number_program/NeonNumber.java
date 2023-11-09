package number_program;

import java.util.Scanner;
public class NeonNumber {
	public static void isNeon(int n) {
		int sqr = n*n;
		System.out.println(sqr);
		int sum = 0;
		
		while(sqr!=0) {
			int last = sqr%10;
			sum = sum+last;
			sqr = sqr/10;
		}
		if(sum == n) {
			System.out.println(n+" is a Neon number");
		}
		else {
			System.out.println(n+" is not a Neon number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		isNeon(n);
	}
}
