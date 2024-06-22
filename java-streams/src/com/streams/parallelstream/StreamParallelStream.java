package com.streams.parallelstream;

import java.util.Arrays;
import java.util.List;

public class StreamParallelStream {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,45,65,43,7,5,2,5,45,5,5,5,5,5,42,21,12); 
		
		long currentTimeMillis = System.currentTimeMillis();
		
		numbers.stream()
		 .map((Integer s) -> s  * s)
		 .forEach((Integer n) -> System.out.println(n));
		System.out.println("Sequential processing time taken : "+ ( System.currentTimeMillis() - currentTimeMillis) + " milliseconds");
		
		
		long parallelTimeMillis = System.currentTimeMillis();
		
		numbers.parallelStream()
		 .map((Integer s) -> s  * s)
		 .forEach((Integer n) -> System.out.println(n));
		System.out.println("Parallel processing time taken : "+ ( System.currentTimeMillis() - parallelTimeMillis) + " milliseconds");
	}

}
