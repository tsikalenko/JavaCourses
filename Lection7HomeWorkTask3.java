package com.gmail.tsikalenko.nikita;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		System.out.println("Input binar number:");
		str.append(sc.nextLine());
		tenToBin(str);
		sc.close();
	}
	public static boolean chek(StringBuilder str) {
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != '0' && str.charAt(i) != '1') {
				return false;
			}
		}
		return true;
	}
	public static void tenToBin(StringBuilder str) {
		if(!chek(str) || str.length() >= 32) {
			System.out.println("Wrong number!");
			return;
		}
		int a = 1;
		int n = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == '1') {
				n += a;
			}
			a *= 2;
		}
		System.out.println(n);
	}

}

