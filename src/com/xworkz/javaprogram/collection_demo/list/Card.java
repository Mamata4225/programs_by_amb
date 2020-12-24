package com.xworkz.javaprogram.collection_demo.list;

public class Card {
   String typeOfCard;
   int number;
   String color;
   
   public Card(String typeOfCard, int number, String color) {
	   
   this.typeOfCard = typeOfCard;
   this.number = number;
   this.color = color;
   }

@Override
public String toString() {
	return "Card [typeOfCard=" + typeOfCard + ", number=" + number + ", color=" + color + "]";
}

}
