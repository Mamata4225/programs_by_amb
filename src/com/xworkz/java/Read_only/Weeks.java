package com.xworkz.java.Read_only;

public class Weeks {
private String days = "7 days";

public String getDays() {
	return days;
}
public static void main(String[] args) {
	Weeks w =new Weeks();
	
	
String result = w.getDays();
System.out.println("Days in a week:" + " " + result);
 }
}
