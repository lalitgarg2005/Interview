package com.keentech.baba;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 1. Java provides a new method forEach() to iterate the elements. 
 * 2. It is defined in Iterable and Stream interface. 
 * 3. It is a default method defined in the Iterable interface. 
 * 4. Collection classes which extends Iterable interface can use forEach loop to iterate elements.
 * 5. This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.
 * 6. forEachOrdered() - It is used to iterate elements in the order specified by the stream.
 */

public class ForEachExample {

	public static void main(String args[]) {
		
		List<String> states = new ArrayList<String>();
		states.add("Gerogia");
		states.add("Texas");
		states.add("California");
		
		states.forEach(state -> System.out.println(state));
		//Using Method Reference
		System.out.println("**********   Using Method Reference   *************");
		states.forEach(System.out::println);
		//forEachOrdered
		System.out.println("**********   Using forEachOrdered   *************");

		states.stream().forEachOrdered(state -> System.out.println(state));
	}
	
}
