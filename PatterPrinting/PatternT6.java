package practice.pattern;

public class PatternT6 {
	public static void main(String[] args) {
		int n=5;
		for(int i=5;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

//5 
//4 5 
//3 4 5 
//2 3 4 5 
//1 2 3 4 5 