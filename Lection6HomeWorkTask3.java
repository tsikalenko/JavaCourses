package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		rectangle(3,5);
	}
	public static void rectangle(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
