package StringProgram;

import java.util.*;

public class VowelsConstant {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Phrase: ");
		String str = sc.next();
		str = str.toLowerCase();
		countDisplay(str);
		
	}
	
	public static void countDisplay(String str) {
		int vowels =0;
		int constant = 0;
		String vowelsList = "";
		String constList = "";
		
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch =='i'||ch =='o' ||ch =='u' ) {
					vowels++;
					vowelsList += ch+" ";
				}
				else {
					constant++;
					constList += ch+" ";
				}
			}
		}
		System.out.println("vowels count: "+vowels+" ( "+vowelsList+")" );
		System.out.println("Constant count: "+constant+" ( "+constList+")" );
	}

}
