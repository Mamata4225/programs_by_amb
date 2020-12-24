package com.xworkz.javaprogram.Aptiprograms2;
/*
 *            *
 *          * * 
 *        *   *
 *      *     *
 *    * * * * * * * * * 
 *            *     *
 *            *   *
 *            * *
 *            *
 */

public class PatternDaimond2 {
	public static void main(String[] args) {
int Lines=9;
int mid = Lines/2;
int space = mid;
int star = 1;


for(int i=0; i<Lines; i++) {
for(int j=0; j<space; j++)	{
System.out.print("  ");
}
for (int k=star; k>0; k--) {
	int kValue = star;
	if((k==star && i<mid) || (k==1 && i>mid) || i==mid || k==(kValue/2+1))
 
		System.out.print("* ");
 else
	 System.out.print("  ");
}
if(i<mid) {
	space--;
	star = star+2;
}
else {
	space++;
	star = star-2;
	
   }
System.out.println();
  }
  }

}