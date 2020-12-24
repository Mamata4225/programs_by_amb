package com.xworkz.javaprogram.ArrayMatrix;

import java.util.Scanner;

    public class TransposeMatrix{  
  public static void main(String args[]){  
 
int matrix[][]= new int [3][3];    
Scanner s = new Scanner(System.in);
  
     int transpose[][]=new int[3][3];   
    
     {
    	 System.out.println("give elements");
     }
       for(int i=0;i<3;i++){    
          for(int j=0;j<3;j++){    
           transpose[i][j]=matrix[j][i];
           matrix[i][j] = s.nextInt();
   }    
 
}    
  
              System.out.println("Printing Matrix without transpose:");  
          for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){ 
                	
     System.out.print(matrix[i][j]+" ");    
}    
          System.out.println();    
}    
          System.out.println("Printing Matrix After Transpose:");  
   for(int i=0;i<3;i++){    
     for(int j=0;j<3;j++){
    	  transpose[i][j]=matrix[j][i];
        System.out.print(transpose[i][j]+" ");  
        
            }  
  
          System.out.println();   
          }   
     }
}