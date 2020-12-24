package com.xworkz.javaprogram.wrapping_class;

public class customer {
	

		public static void main(String[] args) {
			
			Demart dmart = new Demart();
			
			try {
				dmart.findItem("fruits");
				dmart.payBill(1000);
			}
	catch (DemartExp de) {
		if(dmart.isServerUp);
		else {
			System.out.println(de.getMessage());
	}
		}
		}
}


