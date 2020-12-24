package com.xworkz.javaprogram.Exception.unchecked;

public class Dmart {
String fruits;
String vegitables;
String cloths;
boolean isServerUp=false;

 void findItem(String itemName)throws DemartExp{
	 if(itemName.equalsIgnoreCase(cloths)|| 
		itemName.equalsIgnoreCase(vegitables)|| 
        itemName.equalsIgnoreCase(fruits)) {
		 System.out.println("Item found please collect it....!");
	 }
	 else {
		 DemartExp de = new DemartExp();
		 throw de;
		 
	 }
}
 void payBill(int amount)throws DemartExp {
	 if(isServerUp) {
		 System.out.println("thank you");
	 }
 }
}
