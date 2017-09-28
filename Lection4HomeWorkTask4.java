package lection4;

import java.util.Scanner;

public class Lection4HomeWorkTask4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a: ");
		int a = sc.nextInt();
		System.out.println("Input b: ");
		int b = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
			if((i == 0) || (i == (a - 1))) {
				for (int j = 0; j < b; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < b; j++) {
					if((j == 0) || (j == (b - 1))) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
