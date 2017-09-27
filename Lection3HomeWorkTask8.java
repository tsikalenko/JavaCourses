package lection3;

import java.util.Scanner;

public class Lection3HomeWorkTask8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number > 99999 & < 1000000");
		int n = sc.nextInt();
		int n1 = n / 100000;
		int n2 = n % 100000 / 10000;
		int n3 = n % 10000 / 1000;
		int n4 = n % 1000 / 100;
		int n5 = n % 100 / 10;
		int n6 = n % 10;
		
		if( (n1 == n6) && (n2 == n5) && (n3 == n4)) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
		
		sc.close();
	}

}
