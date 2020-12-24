package com.xworkz.javaprogram.DEC19;

public class FirstSecondBig {
public static void main(String[] args) {
	
	
	int[] arr = {80,10,30,50,70};
	
	int fBig = arr[0];
	int sBig = arr[1];
	
	for(int i=0; i<arr.length;i++) {
		if(fBig<arr[i]) {
			sBig = fBig;
			fBig = arr[i];
		}
		else if(sBig<arr[i] && arr[i]!=fBig) {
			sBig = arr[i];
		}
	}
	System.out.println("First big is : "+fBig);
	System.out.println("Second big is : "+sBig);
}
}
