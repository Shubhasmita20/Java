package array;

public class MaximumMinimumNumber {
public static int maximumElement(int []arr) {
	int max = arr[0];
	for(int i = 1; i<arr.length;i++) {
		if(arr[i] > max ) {
			max = arr[i];
		}
	}
	return max;
}

public static int minimumElement(int []arr) {
		int min = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(arr[i] < min ) {
				min = arr[i];
			}
		}
		return min;
}
public static void main(String[] args) {
	int []arr = {2,4,7,1,3,6,5};
	System.out.println("Maximum Number: "+maximumElement(arr));
	System.out.println("Minimum Number: "+minimumElement(arr));
}
}
