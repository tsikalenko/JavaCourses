//10 minutes
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
			arr[i] = (int)(Math.random() * 99 + 1);
		}
		System.out.println(Arrays.toString(arr));
		
		int i = 0;
		int j = arr.length-1;
		int swap;
		for(; i < arr.length/2;) {
			swap = arr[i];
			arr[i] = arr[j];
			arr[j] = swap;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}
}
