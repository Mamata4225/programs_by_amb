package com.xworkz.javaprogram.Arrays;

public class NewsPaperCollectionTest {
public static void main(String[] args) {
	
	NewsPaper hindu =new NewsPaper("Hindu","English",12,5.00);
	NewsPaper prajavani =new NewsPaper("Prajavani","kannada",8,4.00);
	NewsPaper deccan =new NewsPaper("Deccan","English",13,6.00);

	NewsPaper[] newsPapers = new NewsPaper[3];
	newsPapers[0] = hindu;
	newsPapers[1] = prajavani;
	newsPapers[2] = deccan;
	
	for (int i = 0; i< newsPapers.length; i++) {
		System.out.println(newsPapers[i]);
	}
   }
}
