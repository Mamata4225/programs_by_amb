package com.xworkz.java.programs.method;

public class Mamata {
	public static void main (String[] args) {
		Shop shop = new Shop();
		System.out.println("Mamata going to shop to get book");
		System.out.println("Mamata got book");
		Book book = shop.giveBook("Vidya", 100);
		System.out.println("");
		book.open();
		book.turnPage();
		book.closeBook();
	}

}
