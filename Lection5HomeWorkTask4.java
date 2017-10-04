package com.gmail.tsikalenko.nikita;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input string:");
		String a = sc.nextLine();
		
		char[] arr = a.toCharArray();
		int count = 0;
		
		for (char el : arr) {
			if(el == 'b') {
				count++;
			}
		}
		System.out.println("Count = " + count);
		
		sc.close();
	}
}
