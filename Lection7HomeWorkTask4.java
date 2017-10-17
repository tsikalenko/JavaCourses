package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		for (int i = 2; i < 12; i++) {
			System.out.println(doubleToString(Math.PI, i));
		}
	}
	public static String doubleToString(double number, int n) {
		String text = String.format("%." + n + "f", number);
		return text;
	}

}
