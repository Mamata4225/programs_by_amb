package com.xworkz.mamata.Object_class_method.Finalize_method;

public class FinalizeMethodDemo {
	
public static void main(String[] args) {
	System.out.println("Main started");
	Radio radio = new Radio();
	
	radio = null;
	System.gc();
	System.out.println("Main Ended");
}
}
