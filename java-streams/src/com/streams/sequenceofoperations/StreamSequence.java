package com.streams.sequenceofoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSequence {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,1,4,7,10); 
		 List<Integer> sorted = numbers.stream()
				.filter((Integer s) -> s>3)
				.peek((Integer n) -> System.out.println(" After filter : " +n))
				.map((Integer s) -> s * -1)
				.peek((Integer n) -> System.out.println(" After Negating : " +n))
				.sorted()
				.peek((Integer n) -> System.out.println(" After Sorting : " +n))
				.collect(Collectors.toList());
		 // As we need all the elements to perform sorting it does all the operations possible 

	}

}
