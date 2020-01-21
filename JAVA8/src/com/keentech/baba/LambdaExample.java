package com.keentech.baba;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/** Lamba Expression - 
 * 1. It provides a clear and concise way to provide the implementation of an interface which has functional interface.
 * 2. It is very useful in collection library. It helps to iterate, filter and extract data from collection.
 * 3. Java lambda expression is treated as a function, so compiler does not create .class file.
 */
/**
. Lambda expressions - are anonymous functions. 
. used to implement the abstract method in functional interface.
. Can be passed as parameter in another function or can be returned from another function.
*/

interface Addable {
	public int sum(int a, int b);
}

interface Sayable {
	public String say(String str);
}

public class LambdaExample {

	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String args[]) {
		
		LambdaExample l = new LambdaExample();
		l.regularMethod();
		l.lambda1("Ram");
		l.lambda2();
		l.lambda3();
	}

    //without lambda, FunctionalInterface implementation using anonymous class  

	public void regularMethod() {
		Addable ad = new Addable() {
			public int sum(int a, int b) {
				return a + b;
			}
		};
		System.out.println("Regular Method Sum = " + ad.sum(2, 3));
	}
		
	public void lambda1(String myName) {
		Sayable s = name -> {
			return "Hello " + name;
		};
		System.out.println(s.say(myName));
	} 
	
	public  void lambda2() {
		//It can be written in either way
//		Addable ad = (a, b) -> {
//			return (a + b);
//		};
		Addable ad = (a,b) -> a+b;
		System.out.println("Lambda Expression Sum = " + ad.sum(5, 10));	
	}
	

	public  void lambda3() {
		for(int i=0;i<50;i++) list.add(i);
		Stream<Integer> st = list.stream().filter(p -> p > 45);
		System.out.println("Numbers greater than 45 are:");
		st.forEach(x -> System.out.println(x));
	}
}


