package com.streams.build;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		//1
		List<Integer> salaryList = Arrays.asList(34,5,4); 
		Stream<Integer> stream = salaryList.stream();
		
		
		//2 ARRAY
		Integer[] salaryArray = {23,4234,53456,656};
		Stream<Integer> stream2 = Arrays.stream(salaryArray);
		
		//3 Static method
		Stream<Integer> of = Stream.of(1,234,345);
		
		//4 StreamBuilder
		Stream.Builder<Integer> sbuilder = Stream.builder();
		sbuilder.add(122).add(342);
		Stream<Integer> build = sbuilder.build();
		
		//5 Stream Iterate
		Stream<Integer> streamIterate = Stream.iterate(1000, (Integer n) -> n+6000).limit(5);
		
	}

}
