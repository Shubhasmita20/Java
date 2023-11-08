package number_program;
import java.util.Scanner;

public class Fibbonaci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
	fibbonaci(n);
}
public static void fibbonaci(int n) {
	
	int f1 = 0;
	int f2 = 1;
	
	for(int i = 0; i<n; i++) {
		System.out.println(f1+ " ");
		int sum = f1+f2;
		f1 = f2;
		f2 = sum;
	}
	
}
}
