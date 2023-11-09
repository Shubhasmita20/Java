package number_program;

import java.util.Scanner;

public class SpyNumber {
	public static void isSpy(int n) {
		int temp = n;
		int sum = 0;
		int product = 1;
		
		while(temp != 0) {
			int last = temp%10;
			sum = sum+last;
			product = product*last;
			temp = temp/10;
		}
		
		if(sum == product) {
			System.out.println(n+" is a Spy number.");
		}
		else {
			System.out.println(n+" is not a Spy number.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		isSpy(n);
	}
}
