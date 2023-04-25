package com.encora.util;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	private void setMonth(int month) {
		if(month > 12)
			this.month = 12;
		else if (month < 1)
			this.month = 1;
		else
			this.month = month;
	}
	
	private void setDay(int day) {
		if(day > 31)
			this.day = 31;
		else if (day < 1)
			this.day = 1;
		else 
			this.day = day;
	}
	
	private void setYear(int year) {
		if(year < 2023)
			this.year = 2023;
		else if(year > 2030)
			this.year = 2030;
		else
			this.year = year;
	}
	
	
	public MyDate(int day,int month,int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day + "-" + month + "-" + year;
	}
	
	
}
