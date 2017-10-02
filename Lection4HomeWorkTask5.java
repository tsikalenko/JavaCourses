package lection4;

import java.util.Scanner;

public class Lection4HomeWorkTask5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input size:");
		int size = sc.nextInt();
		int n = 1;
		for (int i = 0; i < (size * 2) + 1; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i < size-1) {
				n++;
			} else {
				n--;
			}
		}
		
		sc.close();
	}

}
