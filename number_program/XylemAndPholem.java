package number_program;

import java.util.Scanner;

public class XylemAndPholem {
	public static void isXylem(int n) {
		int temp = n;
		int inner_sum = 0;
		int outer_sum = 0;
		
		while(temp != 0) {
			if(temp == n || temp < 10) {
				int lastFirst = temp%10;
				outer_sum = outer_sum+lastFirst;
			}
			else {
				int middle = temp%10;
				inner_sum = inner_sum+middle;
			}
			temp = temp/10;
		}
		if(inner_sum == outer_sum) {
			System.out.println("Xylem");
		}
		else {
			System.out.println("Pholem");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		isXylem(a);
	}
}
