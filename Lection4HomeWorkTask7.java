package lection4;

import java.util.Scanner;

public class Lection4HomeWorkTask7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input odd number");
		int n = sc.nextInt();
		int star = n;
		int space = 0;
		for (int j = 0; j < (n / 2) + 1; j++) {
			for (int k = 0; k < space / 2; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < space / 2; k++) {
				System.out.print(" ");
			}
			star -= 2;
			space += 2;
			System.out.println();
		}
		star += 4;
		space -= 4;
		for (int j = 0; j < n / 2; j++) {
			for (int k = 0; k < space / 2; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			for (int k = 0; k < space / 2; k++) {
				System.out.print(" ");
			}
			star += 2;
			space -= 2;
			System.out.println();
		}

		sc.close();

	}
}
