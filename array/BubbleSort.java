package Sorting;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if (arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] arr = {5,6,7,9,2,1,0,8};
		System.out.print("original Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		bubbleSort(arr);
		
		System.out.println();
		
		System.out.print("Sorted Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
}
}
