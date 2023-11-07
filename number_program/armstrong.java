package number_program;

import java.util.Scanner;

public class armstrong {
	public static int count(int n) {
		int count = 0;
		while(n >0) {
			n=n/10;
			count++;
		}
		return count;
	}
	public static int isArmstrong(int n) {
		int power = count(n);
        int temp = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            sum = (int) (sum+Math.pow(rem, power));
            n=n/10;
        }
        
        if(sum==temp)
            System.out.print("Armstrong");
        else
            System.out.print("Not");

        return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		isArmstrong(n);
	}
}
