package com.gmail.tsikalenko.nikita;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		differents();
	}
	public static Date inputDate() {
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input dante(dd.mm.yyyy):");
		String dataText = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		
		try {
			date = sdf.parse(dataText);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		sc.close();
		return date;
	}
	public static Calendar dateToCalendar(Date date) {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdfDay = new SimpleDateFormat("dd");
		SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");
		SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
		cl.set(Calendar.YEAR, Integer.parseInt(sdfYear.format(date)));
		cl.set(Calendar.MONTH, Integer.parseInt(sdfMonth.format(date)));
		cl.set(Calendar.DAY_OF_MONTH, Integer.parseInt(sdfDay.format(date)));
		return cl;
	}
	public static void differents() {
		Calendar dateNow = Calendar.getInstance();
		Calendar dateSet = dateToCalendar(inputDate());
		if(dateNow.get(dateNow.DAY_OF_MONTH) != dateSet.get(dateSet.DAY_OF_MONTH)) {
			System.out.println("Now day: " + dateNow.get(dateNow.DAY_OF_MONTH) + " Set day: " + dateSet.get(dateSet.DAY_OF_MONTH));
		}
		if(dateNow.get(dateNow.YEAR) != dateSet.get(dateSet.MONTH)) {
			System.out.println("Now month: " + dateNow.get(dateNow.MONTH) + " Set month: " + dateSet.get(dateSet.MONTH));
		}
		if(dateNow.get(dateNow.YEAR) != dateSet.get(dateSet.YEAR)) {
			System.out.println("Now year: " + dateNow.get(dateNow.YEAR) + " Set year: " + dateSet.get(dateSet.YEAR));
		}
	} 

}
