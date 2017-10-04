package com.gmail.tsikalenko.nikita;

import java.util.Arrays;

class Main {

	public static void main(String[] args) {
		int[] arr1 = new int[15];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random()* 99 + 1); 
		}
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length*2);
		for (int i = arr2.length/2; i < arr2.length; i++) {
			arr2[i] = arr2[i - arr2.length/2]*2;
		}
		
		System.out.println(Arrays.toString(arr2));
	}

}
