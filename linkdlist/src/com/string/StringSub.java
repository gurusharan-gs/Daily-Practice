package com.string;

import java.util.Iterator;

public class StringSub {
	
	public static void main(String[] args) {
		
//		to generate a substring 
		String name = "abcd";
		for(int i=0; i<name.length(); i++) {
			for(int j=i+1; j<=name.length(); j++) {
				System.out.println(name.substring(i, j));
			}
		}
	}

}
