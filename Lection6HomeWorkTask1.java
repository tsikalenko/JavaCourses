package com.gmail.tsikalenko.nikita;

public class Main {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};
		System.out.println("Max = " + max(arr));
	}
	public static int max(int[] arr){
		int max = arr[0];
		for (int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
}
