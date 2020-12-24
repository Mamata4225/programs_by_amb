package com.xworkz.javaprogram.Aptiprograms2;
/*    
 *         *
 *        * *
 *       * * *
 *      * * * *
 *       * * *
 *        * *
 *         *  
 */
public class PatternC2 {
     public static void main(String[] args) {
    	 int noOfLines = 11;
    	 int mid = noOfLines/2;
    	 int space= mid;
    		for(int i=0; i<noOfLines; i++) {
    			for(int j=0; j<space; j++) {
    			 
    				System.out.print(" ");
    	     	}
    			for (int k=mid-space+1; k>0; k--) {
    				System.out.print("* ");
    				
    			}
    			if(i<mid)
    			space--;
    			else
    			space++;
    	            System.out.println();
    	}
      }
    }
