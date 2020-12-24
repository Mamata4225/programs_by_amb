package com.xworkz.javaprogram.Aptiprograms2;

public class Heart2 {


	public static void main(String[] args) {
		int i;
		int j;
		int n=5;
		//
		for ( i=n/2; i<=n; i +=2)
		{
			for (j=1; j<n-i; j +=2) 
			{
				System.out.print(" ");
			}
				for (j=1; j<=i; j++)
				{
					System.out.print("I");
	    		}
				for (j=1; j<=n-i; j++)
				{
					System.out.print(" ");
				}
				for (j=1; j<=i; j++) 
				{
					System.out.print("L");
				}
				System.out.println();
		}
					//
		
			for ( i=n; i>=1; i--) {
				
					for (j=i; j<n; j++)
					{
						System.out.print(" ");
					}
					for(j=1; j<=(i*2)-1; j++)
				
			{
				System.out.print("U");
			}
		System.out.println();
	}
		}
	}
