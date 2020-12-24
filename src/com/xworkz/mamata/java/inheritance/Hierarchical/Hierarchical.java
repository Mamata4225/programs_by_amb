package com.xworkz.mamata.java.inheritance.Hierarchical;

public class Hierarchical {
	public static void main (String[] args) {

		System.out.println("ECE branch details...");
		EC ec = new EC();
		ec.maths();
		ec.physics();
		ec.networkAnalysis();
		ec.fieldTheory();
	
		System.out.println("CSE branch details...");
		CSE cse = new CSE();
		cse.maths();
		cse.physics();
		cse.dataStructure();
		cse.machineLearning();
	


        System.out.println("MECH branch details...");
        MECH mech = new MECH();
        mech.maths();
        mech.physics();
        mech.dme1();
        mech.dme2();
        }
      }
      