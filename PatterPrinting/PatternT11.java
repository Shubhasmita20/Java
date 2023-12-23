package practice.pattern;

public class PatternT11 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
				//👇this loop will print space n-i if i=1 n=5 5-1 4 spaces will be created			
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


//OUTPUT:
//    *
//   **
//  ***
// ****
//*****

