package com.xworkz.javaprogram.Arrays;

public class NewsPaper {
String Name;
String language;
int noOfPages;
double price;
public NewsPaper(String Name,String language,int noOfPages,double price) {
	this.Name = Name;
	this.language=language;
	this.noOfPages=noOfPages;
	this.price=price;
	
}
@Override
public String toString() {
	return "NewsPaper [Name=" + Name + ", language=" + language + ", noOfPages=" + noOfPages + ", price=" + price + "]";
}
}
