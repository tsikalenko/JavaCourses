package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] {0,5,2,4,7,1,3,19};
		int count = 0;
		for (int el : arr) {
			if(el % 2 == 1) {
				count++;
			}
		}
		System.out.println("Count odd number = " + count);
	}

}
