package com.xworkz.mamata.java.inheritance.multilevel;

public class MultilevelinheritanceDemo {
	
	public static void main(String[] args) {
	 System.out.println("Properties of Puppy..");
	 Puppy puppy = new Puppy();
	 puppy.walk();
	 puppy.eat();
	 puppy.sleep();
	 puppy.bark();
	 puppy.play();
	
     System.out.println("Properties of Dog..");
     Dog dog = new Dog();
     dog.walk();
     dog.eat();
     dog.sleep();
     dog.bark();
    
     System.out.println("Properties of Animal..");
     Animal animal = new Animal();
     animal.eat();
     animal.walk();
     animal.sleep();
   
	}
}
