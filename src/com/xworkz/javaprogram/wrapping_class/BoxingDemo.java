package com.xworkz.javaprogram.wrapping_class;

public class BoxingDemo {
public static void main(String[] args) {
	
	int k = 10;
	Integer l = new Integer(k); //new keyword Explicit boxing 
	
	System.out.println("l :"+l);
	
	Integer m = k;
	System.out.println("m :"+m);// auto boxing

	char c = 'a';
	Character ch = new Character(c);
	System.out.println("ch :"+ch);
	
	Character ch1= c;
	System.out.println("ch1 :"+ch1);
}


}
