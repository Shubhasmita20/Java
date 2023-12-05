package array;

public class SelectionSortingInt {
	public static int [] sortedArray(int arr[]) {
		for(int i = 0; i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int [] arr = {5,6,7,9,2,1,0,8};
		
		System.out.print("Original Array: ");
		for(int i= 0; i< arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int  [] res = sortedArray(arr);
		
		System.out.print("Sorted Array: ");
		for(int i= 0; i< res.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	}

