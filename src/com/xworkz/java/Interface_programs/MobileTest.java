package com.xworkz.java.Interface_programs;

public class MobileTest {
	
	public static void main(String[] args){ 
        ServiceProvider airtel = new Airtel();
		ServiceProvider idea = new Idea();
		MiMobile mobile = new MiMobile();
		mobile.simSlot(airtel);
		mobile.simSlot(idea);
 }
}