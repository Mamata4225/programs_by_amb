package com.xworkz.javaprogram.Exception.checked;

public class Public {
public static void main(String[] args) {
	Election election = new Election();
	try {
		election.vote(19);
	}
	catch(PubExp pubExp) {
		System.out.println(pubExp);
	}
}
}
