package practice.pattern;

public class PatternT12 {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=5;i>=1;i--) {
			for(int s=1;s<=i-1;s++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

//    5
//   54
//  543
// 5432
//54321