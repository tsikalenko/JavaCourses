package lection3;

import java.util.Scanner;

public class Lection3HomeWorkTask5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x:");
		int x = sc.nextInt();
		System.out.println("Enter y:");
		int y = sc.nextInt();

		if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 4) {
			System.out.println("Point in circle");
		} else {
			System.out.println("Point behind circle");
		}

		sc.close();
	}

}
