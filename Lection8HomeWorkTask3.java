package com.gmail.tsikalenko.nikita;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		File folder = new File("E:/Ôîòî/");
		
		System.out.println(getFileInfo(folder));
	}
	public static String getFileInfo(File file) {
		String fileName = file.getName();
		String type = "";
		if (file.isFile()) {
			type = "File";
		} else {
			type = "Folder";
		}
		long fileSize = file.length();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date(file.lastModified());
		String fileDate = sdf.format(date);
		String fileInfo = String.format("%-50.50s\t%-12.12s\t%-6.6s\t%-10.10s", fileName, Long.toString(fileSize), type,
				fileDate);
		return fileInfo;
	}

	public static String getFolderInfo(File folder) {
		StringBuilder sb = new StringBuilder();
		File[] files = folder.listFiles();
		for (File file : files) {
			if(file.isDirectory()) {
				sb.append(getFileInfo(file)).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

}
