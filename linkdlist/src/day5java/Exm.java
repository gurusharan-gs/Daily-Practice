package day5java;

import java.util.Scanner;

public class Exm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;
		for (int i = 0; i < Math.abs(y / x); i++) {
			if (i % 2 == 0 && i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
