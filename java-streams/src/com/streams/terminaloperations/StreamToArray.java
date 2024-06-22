package com.streams.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,1,4,7,10); 
		Integer[] array = numbers.stream()
		 .filter((Integer s) -> s>3)
		 .toArray((int size) -> new Integer[size]);
	}

}
