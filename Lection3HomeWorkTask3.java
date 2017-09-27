package lection3;

import java.util.Scanner;

public class Lection3HomeWorkTask3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter year:");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("In year 366 day");
		} else {
			System.out.println("In year 365 day");
		}
		
		sc.close();
	}
}
