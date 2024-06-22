package com.streams.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,1,4,7,10); 
				numbers.stream()
				 .filter((Integer s) -> s>3)
				 .forEach((Integer n) -> System.out.println(" After filter : " +n));

	}

}
