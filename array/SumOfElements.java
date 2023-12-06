package array;

import java.util.Scanner;

public class SumOfElements {
	
	public static int sumOfArrayElement(int arr[]) {
		int sum = 0;
		for(int i = 0; i<= arr.length-1;i++) {
			sum = sum+arr[i];
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of inputs: ");
		int n = sc.nextInt();
		int arr[] =  new int[n];
		
		for(int i=0; i<n;i++) {
			System.out.print("Enter the value: ");
			arr[i]=sc.nextInt();
		}
		int []array= arr;
		System.out.println(sumOfArrayElement(array));
	}

}
