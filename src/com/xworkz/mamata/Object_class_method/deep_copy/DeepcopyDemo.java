package com.xworkz.mamata.Object_class_method.deep_copy;

public class DeepcopyDemo {
      public static void main(String[] args) throws CloneNotSupportedException {
    	  
    	  Xworkz xworkz =  new Xworkz();
    	  xworkz.name = "xworkz";
    	  xworkz.founder = "Omkar";
    	  xworkz.location = "Rajajinagar";
    	  xworkz.asha.name = "Asha";
    	  xworkz.asha.dob = "29-12-1992";
    	  Xworkz duplicateXworkz = xworkz.clone();
    	  
    	  duplicateXworkz.founder = "Prajwal";
    	  duplicateXworkz.asha.dob = "29-09-1993";
    	  duplicateXworkz.asha.name = "asha";
    	  
    	  System.out.println(xworkz);
    	  System.out.println(duplicateXworkz);
      }

	@Override
	public String toString() {
		return "DeepcopyDemo []";
	}
      
}
