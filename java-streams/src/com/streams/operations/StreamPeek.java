package com.streams.operations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeek {

	public static void main(String[] args) {
		Stream<Integer> nums = Stream.of(1,45,65,43,7,5,2,5,45,5,5,5,5,5,42,21,12);
		List<Integer> collect = nums.filter((Integer n) -> n > 6)
									.distinct()
									.peek((Integer n) -> System.out.println(n))
									.collect(Collectors.toList());
		
	}

}
