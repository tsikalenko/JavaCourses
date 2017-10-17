package com.gmail.tsikalenko.nikita;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lendth Hemming = " + hemming(intToBin(117), intToBin(17)));
	}

	public static StringBuilder intToBin(int n) {
		StringBuilder s = new StringBuilder();
		int d = (int) (Math.pow(2, 30));
		for (int i = 0; i < 30; i++) {
			if (n / d == 1) {
				s.append(1);
				n -= d;
			} else {
				s.append(0);
			}
			d /= 2.0;
		}
		return s;
	}

	public static int hemming(StringBuilder n1, StringBuilder n2) {
		int count = 0;
		for (int i = 0; i < 30; i++) {
			if (n1.charAt(i) != n2.charAt(i)) {
				count++;
			}
		}
		return count;
	}

}