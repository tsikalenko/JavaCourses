//20
package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		palindrom();
	}

	public static void palindrom() {
		int pal = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				if (chekPalindrom(i * j)) {
					if (i * j > pal) {
						pal = i * j;
					}
				}
			}
		}
		System.out.println(pal);
	}

	public static boolean chekPalindrom(int n) {
		int n1 = n / 100000;
		int n2 = n % 100000 / 10000;
		int n3 = n % 10000 / 1000;
		int n4 = n % 1000 / 100;
		int n5 = n % 100 / 10;
		int n6 = n % 10;
		if (n < 100000) {
			if ((n2 == n6) && (n3 == n5)) {
				return true;
			} else {
				return false;
			}
		} else {
			if ((n1 == n6) && (n2 == n5) && (n3 == n4)) {
				return true;
			} else {
				return false;
			}
		}
	}
}
