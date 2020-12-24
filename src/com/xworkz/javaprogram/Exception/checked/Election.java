package com.xworkz.javaprogram.Exception.checked;

public class Election {

	void vote(int age) {
		if(age<18) {
			PubExp pubExp = new PubExp();
			throw pubExp;
		}
		else {
			System.out.println("Thank you for voting....!");
		}
	}
}
