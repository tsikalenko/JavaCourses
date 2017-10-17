package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		ArrToString(arr);
	}

	public static void ArrToString(int[] arr) {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i = 0; i < arr.length - 1; i++) {
			str.append(arr[i] + ", ");
		}
		str.append(arr[arr.length - 1] + "]");
		System.out.println(str);
	}

}
