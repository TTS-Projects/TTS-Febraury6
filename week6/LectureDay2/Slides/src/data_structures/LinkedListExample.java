package data_structures;

import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animalList = new LinkedList<String>();
		animalList.add("frog");
		animalList.add("giraffe");
		animalList.add("buffalo");
		animalList.add("mongoose");
		System.out.println(animalList);
		// => [frog, giraffe, buffalo, mongoose]

		// Puts shark as the first element in the ArrayList
		animalList.addFirst("shark"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, buffalo, mongoose]

		// Puts koala as the last element in the ArrayList
		animalList.addLast("koala"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, buffalo, mongoose, koala]
		    
		// This adds the value cuttlefish to the 3rd index of the LinkedList
		animalList.add(3, "cuttlefish"); 
		System.out.println(animalList);
		// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]
	}

}
