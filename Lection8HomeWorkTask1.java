package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file = new File("a.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		saveStringToFile(inputText(), file);
	}
	public static String inputText() {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = "";
		System.out.println("Input text, to finish typing exit:");
		for(;;) {
			s = sc.nextLine();
			if(s.equals("exit")) {
				break;
			}
			sb.append(s).append(System.lineSeparator());
		}
		sc.close();
		return sb.toString();
	}
	public static void saveStringToFile(String s, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
