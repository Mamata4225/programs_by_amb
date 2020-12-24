package com.xworkz.mamata.java.Encapsulation;

public class JavaBeanDemo {
public static void main(String[] args) {
		Table table = new Table();
		table.setMaterial("Wooden");
		table.setPrice(5000.00);
		table.setHeight(5.0);
		table.setShape("round");
		
		System.out.println(table.getMaterial());
		System.out.println(table.getPrice());
		System.out.println(table.getHeight());
		System.out.println(table.getShape());
		
	}

}
