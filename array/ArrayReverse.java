package array;

public class ArrayReverse {
	
	public static void reverseArr(int a[]) {
		for(int i = a.length-1; i>=0; i--) {
			System.out.print(" " +a[i]);
		}
	}
	
	public static void main(String[] args) {
		int [ ] a = {5,3,7,9,1};
		reverseArr(a);
	}

}
