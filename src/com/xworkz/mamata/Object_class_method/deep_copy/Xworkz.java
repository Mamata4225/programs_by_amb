package com.xworkz.mamata.Object_class_method.deep_copy;

public class Xworkz implements Cloneable{
	String name;
	String founder;
	String location;
	Asha asha = new Asha();
	
	@Override
	public Xworkz clone() throws CloneNotSupportedException {
	   Xworkz xworkz = (Xworkz)super.clone();
	 
	   return xworkz;
	}
	@Override
	public String toString() {
		return "Xworkz [name=" + name + ", founder=" + founder + ", location=" + location + ", asha=" + asha +"]";
	}



}
