package com.string;

public class ReverseWorldInSentence {
	
	public static void main(String[] args) {
		
		String str = "i am backend developer";
		String ans = "";
		StringBuilder sb = new StringBuilder("");
		System.out.println(str);
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				sb.append(ch);
			}else {
				sb.reverse();
				ans += sb;
				ans += " ";
				sb = new StringBuilder("");
			}
		}
		sb.reverse();
		ans += sb;
		System.out.println(ans);
	}

}
