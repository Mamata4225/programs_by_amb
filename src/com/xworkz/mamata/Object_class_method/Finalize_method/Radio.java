package com.xworkz.mamata.Object_class_method.Finalize_method;

public class Radio {
String brand;
double price;
@Override
protected void finalize() throws Throwable {
	System.out.println("finalize() method overiden"); 
}


}
