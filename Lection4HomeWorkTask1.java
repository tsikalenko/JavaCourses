package lection4;

import java.util.Scanner;

public class Lection4HomeWorkTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int n = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < n; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("---");
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
