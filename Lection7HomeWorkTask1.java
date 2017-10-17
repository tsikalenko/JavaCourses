package com.gmail.tsikalenko.nikita;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date date1 = new Date();
		
		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.MONTH, cl.get(Calendar.MONTH) - 1);
		Date date2 = cl.getTime();
		
		System.out.println(date1.getTime() - date2.getTime());
	}

}
