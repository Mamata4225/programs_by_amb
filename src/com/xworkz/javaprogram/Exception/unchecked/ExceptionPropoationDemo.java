package com.xworkz.javaprogram.Exception.unchecked;

public class ExceptionPropoationDemo {
	
public static void main(String[] args) {
	System.out.println("main started...");
	try {
		int divResult = computeDivision(10,0);
	System.out.println("divResult :"+divResult);
	}
	catch(ArithmeticException ae) {
		System.out.println("ArithmeticException is caught");
	}
	System.out.println("main ended...");
}
	
private static int computeDivision(int i, int j) {
	// TODO Auto-generated method stub
	return 0;
}

static void computteDivision(int a, int b) {
	try {
    return;
	}
	catch (NumberFormatException e) {
		System.out.println("NumberFormatException is caugth");
	}
}
static int divide(int a, int b) {
	return a/b;
	
}
}
