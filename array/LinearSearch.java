package array;

public class LinearSearch {
public static void main(String[] args) {
	int []arr = {2,6,8,5,4,3,1};
	int key = 4;
	linearSearch(key,arr);
}
public static void linearSearch(int key, int[]arr) {
	for(int i = 0;i<arr.length; i++ ) {
		if(key == arr[i]) {
			System.out.println("The key is found at index " +i);
			return;
		}
		
	}
	System.out.println("Key not found");
}
}
