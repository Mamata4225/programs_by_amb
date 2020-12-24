package com.xworkz.mamata.java.Encapsulation;

public class FullyEncapsulationDemo {
	public static void main(String[] args) {
		Bag bag =new Bag();
		bag.setBrand("wildcraft");
		bag.setColor("black");
		bag.setPrice(1000.00);
		
		System.out.println(bag.getBrand());
		System.out.println(bag.getColor());
		System.out.println(bag.getPrice());
		
	}

}
