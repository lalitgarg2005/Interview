package com.keentech.baba;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Stream
 * Java8 introduced new package java.util.stream. 

 * Stream provides following features:
 
1. Stream does not store elements. 
.  It simply conveys elements from a source such as a data structure, an array through a pipeline of computational operations.
2. Stream is functional in nature. Operations performed on a stream does not modify it's source. 
	For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements,
	rather than removing elements from the source collection.
3. Stream is lazy and evaluates code only when required.
4. The elements of a stream are only visited once during the life of a stream. 
	Like an Iterator, a new stream must be generated to revisit the same elements of the source.
5. You can use stream to filter, collect, print, and convert from one data structure to other etc. 

*/
class State{
	int id;
	String name;
	int population;
	State(int id, String name, int population){
		this.id = id;
		this.name = name;
		this.population = population;
	}
}
public class StreamExample {
	public static void main(String args[]) {
		List<State> stateList = new ArrayList<State>();
		stateList.add(new State(1,"Georgia", 10000));
		stateList.add(new State(2,"Texas", 20000));
		stateList.add(new State(3,"California", 30000));
		
		System.out.println("*** forEach ***");
		stateList.forEach(st -> System.out.println(st.name));
		
		System.out.println("\n *** Stream Filter ***");
		Stream<State> stateList2 = stateList.stream().filter(st -> st.population > 15000);
		stateList2.forEach(st-> System.out.println(st.name));
		
		System.out.println("\n *** Stream Map ***");
		Stream<Integer> populations = stateList.stream().map(st -> st.population);
		populations.forEach(System.out::println);
		
		System.out.println("\n *** Stream Reduce ***");
		int sumPopulations = stateList.stream().map(st -> st.population).reduce(0, (sum, population) -> sum + population);
		System.out.println("Total Population =" + sumPopulations);
		
		System.out.println("\n *** Stream Max ***");
		State maxPopulationState = stateList.stream().max((st1, st2) -> st1.population > st2.population ? 1 : -1).get();
		System.out.println("State with Maximum Population is " + maxPopulationState.name 
				+ " and Population =" + maxPopulationState.population);
		
		System.out.println("\n *** Stream to Map ***");
		Map<Object, Object> statePopulationMap = stateList.stream()
				.collect(Collectors.toMap(st -> st.id, st->st.name));
		System.out.println(statePopulationMap);
		
		System.out.println("\n *** Stream Count ***");
		long count = stateList.stream().filter(st -> st.population <25000).count();
		System.out.println("Total state count with population < 25000 ="  + count);


	}
}
