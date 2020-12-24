package com.xworkz.javaprogram.wrapping_class;

public class UnboxingDemo {
public static void main(String[] args) {
	
	Float f = new Float(10.00);
	float pf = f; //auto unboxing
	System.out.println("pf : "+pf);
	
	float epf = f.floatValue(); // Explicit unboxing
     System.out.println("epf : "+epf);
     
     Boolean b = new Boolean(true);
     boolean pb = b.booleanValue();
     System.out.println("pb :"+pb);
}
}