//97 minutes
package com.gmail.tsikalenko.nikita;

import java.util.Scanner;

public class Main {
	public static String one(int n) {
		switch (n) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return "";
		}
	}
	public static String ten(int n) {
		switch (n) {
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		default:
			return "";
		}
	}
	public static String decade(int n) {
		switch (n) {
		case 1:
			return "ten";
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "fourty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		default:
			return "";
		}
	}
	public static String hundred(int t) {
		String s = "";
		if (t / 100 > 0) {
			s += one(t/100) + " hundred ";
		} 
		if(t % 100 > 9) {
			if(t % 100 < 20 && t % 100 > 10){
				s += ten(t % 100);
			} else {
				s += decade(t % 100 / 10) + " " + one(t % 10);
			}
		} else {
			s += one(t % 10);
		}
		return s;
	}
	public static String dollars(double n) {
		String s ="";
		
		if(n/1000000000 >= 1) {
			s += one((int)(n/1000000000)) + " milliard ";
		}
		if(n % 1000000000 / 1000000 >=1) {
			s += hundred((int)(n % 1000000000 / 1000000)) + " million ";
		}
		if(n % 1000000 / 1000 >= 1) {
			s += hundred((int)(n % 1000000 / 1000)) + " thousand ";
		}
		if(n % 1000 >= 1) {
			s += hundred((int)(n%1000));
		}
		if(!s.equals("")) {
			s += " dollars ";
		}
		return s;
	}
	public static String cents(double n) {
		String s = "";
		int t = (int)(n / 0.1 % 10)*10;
		int o = (int)(n / 0.01 % 10);
		if(t > 0 || o > 0) {
			s += hundred(t + o);
		}
		if(!s.equals("")) {
			s += " cents ";
		}
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How much maney you have?");
		double n = sc.nextDouble();
		System.out.println("You have: " + dollars(n) + cents(n));
		
		sc.close();
	}
}
