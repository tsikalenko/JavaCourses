package lection3;

import java.util.Scanner;

public class Lection3HomeWorkTask4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1-th side: ");
		int a = sc.nextInt();
		System.out.println("Enter 2-th side: ");
		int b = sc.nextInt();
		System.out.println("Enter 3-th side: ");
		int c = sc.nextInt();

		if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
			System.out.println("Triangle real");
		} else {
			System.out.println("Triangle unreal");
		}
		sc.close();
	}
}
