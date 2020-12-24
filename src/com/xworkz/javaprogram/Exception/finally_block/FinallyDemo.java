package com.xworkz.javaprogram.Exception.finally_block;

public class FinallyDemo {
public static void main(String[] args) {
	try {
		System.out.println(10/5);
	}
	catch(Exception e) {
		System.out.println("Exception caught");
	}
	finally {
		System.out.println("Finally block always gets execute");
	}
}
}
