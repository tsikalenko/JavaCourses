package com.gmail.tsikalenko.nikita;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input size array:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Input " + (i + 1) + " element:");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}

}
