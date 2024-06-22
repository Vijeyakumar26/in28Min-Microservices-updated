package com.streams.terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,1,4,7,10); 
		 Optional<Integer> reduce = numbers.stream()
		
		.reduce((Integer val1, Integer val2) -> val1+val2);
		 System.out.println(reduce.get());
	}

}
