//45 minutes
package com.gmail.tsikalenko.nikita;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Choos turn:");
		System.out.println("1: 90:");
		System.out.println("2: 180");
		System.out.println("3: 270");
		int t = sc.nextInt();
		int swap;
		switch (t) {
		case 1: {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr[i].length; j++) {
					swap = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = swap;
				}
			}
		}
			break;
		case 2: {
			for (int i = 0; i < arr.length; i++) {
				int j = arr[i].length - 1;
				for (int k = 0; k < arr[i].length / 2; k++) {
					swap = arr[i][k];
					arr[i][k] = arr[i][j];
					arr[i][j] = swap;
					j--;
				}
			}

		}
			break;
		case 3: {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr[i].length; j++) {
					swap = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = swap;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				int j = arr[i].length - 1;
				for (int k = 0; k < arr[i].length / 2; k++) {
					swap = arr[k][i];
					arr[k][i] = arr[j][i];
					arr[j][i] = swap;
					j--;
				}
			}
		}
			break;
		default:
			System.out.println("Error!");
			break;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
