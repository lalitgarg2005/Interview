package com.keentech.baba;

/** Functional Interface - 
 * 1. It is an interface which has only one abstract method. 
 * 2. It can have any number of default, static methods but can contain only one abstract method. 
 * 3. It can also declare methods of object class.
 * 4. Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces.
 * 5. Java provides an annotation @FunctionalInterface, which is used to declare an interface as functional interface.
 * 6. A functional interface can extends another interface only when it does not have any abstract method.
*/

//Functional Interface with just one abstract method.
interface Talkable1 {
	void talk(String name);
}

//Functional Interface with abstract method and other object class methods
interface Talkable2{
	void talk(String str);
	int hashCode();
	String toString();
	boolean equals(Object ob);
}

public class FunctionalInterfaceExample implements Talkable2 {

	@Override
	public void talk(String name) {
		System.out.println("Hello " + name);
	}
	public static void main(String args[]) {
		FunctionalInterfaceExample fr = new FunctionalInterfaceExample();
		fr.talk("Kumar");
	}
}

/**
 * Java Predefined-Functional Interfaces
 * Function<T,R>		It represents a function that accepts one argument and returns a result.
 * ToIntFunction<T>		It represents a function that returns an integer.
 * BiFunction<T,U,R>	It represents a function that accepts two arguments and returns a a result.
 * IntToDoubleFunction	It represents a function that accepts an integer argument and returns a double.
 * IntToLongFunction	It represents a function that accepts an integer argument and returns a long.
 * LongToDoubleFunction	It represents a function that accepts a long type argument and returns a result of double type.
 * LongToIntFunction	It represents a function that accepts a long type argument and returns an integer result.
 */
