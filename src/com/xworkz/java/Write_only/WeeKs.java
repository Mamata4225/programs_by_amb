package com.xworkz.java.Write_only;

public class WeeKs {

	private String days;

	public void setDays(String days) {
		this.days = days;
	}
	public String getDays() {
		return days;
	}
	public static void main(String[] args) {
		WeeKs weeks =new WeeKs();
		
		weeks.setDays("7 days");
		
	String result = weeks.getDays();
	System.out.println("Days in a week:" + " " + result);
	 }
	}

