package com.xworkz.mamata.java.inheritance.multilevel1;


public class MultilevelInheritanceDemo {
	public static void main (String[] args) {

		System.out.println("cricket details...!");
		cricket cricket = new cricket();
		cricket.batsmen();
		cricket.wicketkeeper();
	
		System.out.println("football details...!");
		football football = new football();
		football.goalkeeper();
	


        System.out.println("hockey details...!");
        hockey hockey = new hockey();
        hockey.hockeystick();
        }
      }

