package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		int[][] arr = new int [][] {{1,2,3}, {1,2,3},{1,2,3}};
		File file = new File("arr.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		arrToFile(arr, file);
	}
	public static void arrToFile(int[][] arr, File file) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sb.append(arr[i][j]).append(" ");
			}
			sb.append(System.lineSeparator());
		}
		String s = sb.toString();
		saveStringToFile(s, file);
	}
	public static void saveStringToFile(String s, File file) {
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
