package number_program;
import java.util.Scanner;

public class Automorphic {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	if(isAutomorphic(n)) {
		System.out.println(n+ " is an Automorphic number.");
	}
	else {
		System.out.println(n+ "is not an Automorphic number.");
	}
}
public static boolean isAutomorphic(int n){
	int temp = n;
	int sqr = n*n;
	System.out.println(sqr);
	int lastTemp;
	int lastSqr;
	
	while(temp != 0) {
		lastTemp = temp %10;
		lastSqr = sqr%10;
		//👇this will check is the number is same or not if they are same else will execute
		if(lastTemp != lastSqr) {
			return false;
		}
		else {
			temp = temp/10;
			sqr = sqr/10;
		}
	}
	return true;
}

}
