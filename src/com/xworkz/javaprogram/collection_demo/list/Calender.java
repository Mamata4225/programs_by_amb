package com.xworkz.javaprogram.collection_demo.list;

public class Calender {
 int year;
 int month;
 int day;
 
 public Calender(int year, int month, int day) {
	 this.year = year;
	 this.month = month;
	 this.day = day;
	 
 }

@Override
public String toString() {
	return "Calender [year=" + year + ", month=" + month + ", day=" + day + "]";
}
}
