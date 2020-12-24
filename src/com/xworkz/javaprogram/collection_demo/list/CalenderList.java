package com.xworkz.javaprogram.collection_demo.list;

import java.util.ArrayList;

public class CalenderList {
public static void main(String[] args) {
	
	ArrayList<Calender> listOfCalender = new ArrayList<Calender>();
	
	Calender calender1 = new Calender(2020, 01, 01);
	Calender calender2 = new Calender(2021, 01, 01);
	Calender calender3 = new Calender(2022, 01, 01);
	Calender calender4 = new Calender(2023, 01, 01);
	
	listOfCalender.add(calender1);
	listOfCalender.add(calender2);
	listOfCalender.add(calender3);
	listOfCalender.add(calender4);
	

	
	for(Calender cl : listOfCalender) {
		System.out.println(cl);
	}
}
}


