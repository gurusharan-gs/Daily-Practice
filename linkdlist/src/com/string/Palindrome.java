package com.string;

public class Palindrome {
	
	public static void main(String[] args) {
		
//		approach 1 palindrome checking  
		String str = "aba";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String s = sb +"";
		if (str.equals(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		
//		approach 2 palindrome checking 
		int start = 0;
		int end = str.length()-1;
		boolean flag = true;
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				flag = false;
				break;
			}
			start++;
			end--;
		}
		if (flag) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		
		
		
	}
	
	

			

}
