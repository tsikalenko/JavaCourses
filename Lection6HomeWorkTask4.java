package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(find(arr,3));
	}
	public static int find(int[] arr, int el) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == el) {
				return i;
			}
		}
		return -1;
	}

}
