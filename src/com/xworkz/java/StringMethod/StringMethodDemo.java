package com.xworkz.java.StringMethod;

public class StringMethodDemo {
public static void main(String[] args) {
	
	String s = "Rose";
	
	System.out.println("char at the position 2:"+s.charAt(2));
	String concatString = s.concat("flower");
	System.out.println(s);
	System.out.println(concatString);
	
	System.out.println(s.contains("os"));
}
}
