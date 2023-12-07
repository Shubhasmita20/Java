package array;

import java.util.Scanner;

public class DuplicateNumber {
	
	public static void duplicate(int arr[]) {
		for(int i = 0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate elements "+arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of inputs: ");
		int n = sc.nextInt();
		int []arr = new int[n];
		
		
		for(int i =0;i<n;i++) {
			System.out.println("Enter the value: ");
			arr[i]=sc.nextInt();
		}
		
		duplicate(arr);
		
		
	}

}
