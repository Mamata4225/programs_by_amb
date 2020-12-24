package com.xworkz.mamata.Object_class_method.getclass_method;

public class GetClassMethodTest {
	
	public static void main(String[] args) {
		
		Bulb bulb = new Bulb();
		bulb.getClass();
	  System.out.println(bulb);
	
	System.out.println("class name of bulb object:"+ bulb.getClass().getSimpleName());
	}

}
