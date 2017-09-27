package lection3;

import java.util.Scanner;

public class Lection3HomeWorkTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1-th number:");
		int a = sc.nextInt();
		System.out.println("Enter 1-th number:");
		int b = sc.nextInt();
		System.out.println("Enter 1-th number:");
		int c = sc.nextInt();
		System.out.println("Enter 1-th number:");
		int d = sc.nextInt();
		int max = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		
		System.out.println("Max = " + max);
		
		sc.close();
	}
}
