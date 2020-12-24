package com.xworkz.javaprogram.collection_demo.list;

import java.util.ArrayList;
import java.util.Iterator;

public class CardsTest {

	public static void main(String[] args) {

		ArrayList<Card>  cards = new ArrayList<Card>();
		Card card1 = new Card("spedes",3,"black");
		Card card2 = new Card("diamond",4,"red");
		Card card3 = new Card("clubs",6,"black");
		Card card4 = new Card("hearts",2,"red");
		
cards.add(card1);
cards.add(card2);
cards.add(card3);
cards.add(card4);

Iterator<Card>  itr =cards.iterator();
	
while(itr.hasNext()) {
	Card card = itr.next();
		if(card.typeOfCard  == "diamond") {
			System.out.println(card);		   
	   }
   }
}
}
