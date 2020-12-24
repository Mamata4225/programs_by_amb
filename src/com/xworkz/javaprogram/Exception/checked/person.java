package com.xworkz.javaprogram.Exception.checked;

public class person {
public static void main(String[] args) {
 
	int amount = 550;
	ATM atm = new ATM();
	try {
		atm.draw(amount);
	}
	catch(ATMException e) {
		if(amount>50000 || amount<100){
			System.out.println(e);
		}
		else {
			System.out.println(e.getMessage());
		}
	}
}
}
