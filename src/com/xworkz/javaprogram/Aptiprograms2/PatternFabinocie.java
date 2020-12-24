package com.xworkz.javaprogram.Aptiprograms2;

public class PatternFabinocie {
	
public static void main(String[] args) {
	int rows=6;
	int fab = 1;
	
	for (int i=0; i<rows; i++) {
	  for(int space=1; space<rows-1;space++) {
		  System.out.print(" ");
	  }
	  for(int j=0;j<=i; j++) {
		  if(j==0 || i==0)
			  fab = 1;
		  else
			  fab = fab * (i-j+1)/j;
		  
		 System.out.println();
	  }
	  }
}

}
