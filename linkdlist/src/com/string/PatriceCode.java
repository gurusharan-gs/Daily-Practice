package com.string;

public class PatriceCode {

	static void toggelString(String s) {

		StringBuilder str = new StringBuilder(s);

//		iterating on string 
		for (int i = 0; i < str.length(); i++) {
			boolean flag = true; // we assume capital letter
			char ch = str.charAt(i);
			if (ch == ' ')
				continue;
			int asci = (int) ch; // char into integer
			if (asci >= 97)
				flag = false; // we assume smail letter

			if (flag == true) {
				asci += 32; // adding value
				char dh = (char) asci; // integer into char
				str.setCharAt(i, dh); // set the value
			} else {
				asci -= 32; // sub value
				char dh = (char) asci; // integer into char
				str.setCharAt(i, dh); // set the value
			}
//			System.out.println(asci);
		}
		System.out.println(str);

	}

	static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	static void palindromeSubstring(String s) {
		int n = s.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (isPalindrome(s.substring(i, j))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String s = "GurUSHaraN";
		toggelString(s);
		palindromeSubstring(s);

	}
}
