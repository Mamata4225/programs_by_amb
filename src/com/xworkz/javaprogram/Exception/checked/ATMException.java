package com.xworkz.javaprogram.Exception.checked;

public class ATMException extends Exception {

	public String toString() {
		return "Sorry, your crossing the limit";
	}
	public String getMessage() {
	
		return "invalid amount";
	}
}
