package com.string;

import java.util.*;
import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder("GurUShaRaN");
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {

			boolean flag = true;

			int ch = str.charAt(i);
			
			if (ch == ' ') continue;
			
			int asci = (int) ch;
			
			if (asci >= 97) {
				flag = false;
			}
			
			if (flag == true) {
				asci += 32;
				char dh = (char) asci;
				str.setCharAt(i, dh);
			} else {
				asci -= 32;
				char dh = (char) asci;
				str.setCharAt(i, dh);
			}
		}
		System.out.println(str);

	}

}
