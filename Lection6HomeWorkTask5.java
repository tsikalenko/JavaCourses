package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		String s = "Hello world!";
		System.out.println(count(s));
	}
	public static int count(String s) {
		String[] s1 = s.split("[ ]");
		return s1.length;
	}

}
