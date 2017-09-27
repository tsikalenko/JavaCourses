package lection3;

import java.util.Scanner;

public class Lection3HomeWorkTask7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number > 999 & < 10000");
		int n = sc.nextInt();
		int a = n / 1000;
		int b = n % 1000 / 100;
		int c = n % 100 / 10;
		int d = n % 10;
		int n1;
		int n2;

		if ((a + b) > 10) {
			n1 = ((a + b) / 10) + ((a + b) % 10);
		} else {
			n1 = a + b;
		}
		if ((c + d) > 10) {
			n2 = ((c + d) / 10) + ((c + d) % 10);
		} else {
			n2 = c + d;
		}
		if(n1 == n2) {
			System.out.println("Lacky tiket");
		} else {
			System.out.println("Simple tiket");
		}
		
		sc.close();
	}

}
