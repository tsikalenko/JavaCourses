package lection4;

import java.util.Scanner;

public class Lection4HomeWorkTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int f = 1;
		
		for (; n > 0; n--) {
			f *= n;
		}
		System.out.println(f);
		
		sc.close();
	}

}