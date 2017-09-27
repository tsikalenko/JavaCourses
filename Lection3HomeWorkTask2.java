package lection3;

import java.util.Scanner;

public class Lection3HomeWorkTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number apartment:");
		int n = sc.nextInt();
		
		if(n > 0 && n < 145) {
			switch( n / 36 ) {
			case 0: System.out.println("Entrance 1 ");
					break;
			case 2: System.out.println("Entrance 2 ");
					break;
			case 3: System.out.println("Entrance 3 ");
					break;
			case 4: System.out.println("Entrance 4 ");
					break;
			}
			switch (n % 36 / 4) {
			case 1: System.out.println("Floor 1");
					break;
			case 2: System.out.println("Floor 2");
					break;
			case 3: System.out.println("Floor 3");
					break;
			case 4: System.out.println("Floor 4");
					break;
			case 5: System.out.println("Floor 5");
					break;
			case 6: System.out.println("Floor 6");
					break;
			case 7: System.out.println("Floor 7");
					break;
			case 8: System.out.println("Floor 8");
					break;
			case 9: System.out.println("Floor 9");
					break;
			}
		} else {
			System.out.println("Erorr!");
		}
		sc.close();
	}

}
