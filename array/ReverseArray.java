package array;

public class ReverseArray {
	
	public static void reverseArray(int arr []) {
		int i = 0;
		int j = arr.length-1;
		
		while(i<i) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {2,6,90,45,78,65};
		
		for(int i = 0; i<= arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		reverseArray(arr);
		
		System.out.println();
		
		for(int i = 0; i<= arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
	