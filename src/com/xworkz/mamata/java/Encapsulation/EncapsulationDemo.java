package com.xworkz.mamata.java.Encapsulation;

public class EncapsulationDemo {
public static void main(String[] args) {
	
	Waterbottle waterBottle = new Waterbottle();
	
	waterBottle.setColor("Blue");
    waterBottle.setPrice(30.00);
    
    System.out.println(waterBottle.getColor());
    System.out.println(waterBottle.getPrice());
}

}
