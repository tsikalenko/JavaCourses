package lection3;

import java.util.Scanner;

public class Lection3HomeWorkTask6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter y");
		int y = sc.nextInt();
		
		int a = (x - 0) * (y - 4) - (x - 4) * (y - 0);
		int b = (x - 4) * (y - 1) - (x - 6) * (y - 4);
		int c = (x - 6) * (y - 0) - (x - 0) * (y - 1);
		if ((a >= 0 && b >= 0 && c >= 0)||(a <= 0 && b <= 0 && c <= 0)) {
			System.out.println("Point in triangle");
		} else {
			System.out.println("Point out triangle");
		}
		
		sc.close();
	}

}
