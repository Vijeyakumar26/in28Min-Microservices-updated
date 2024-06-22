package com.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatmap {

	public static void main(String[] args) {
		List<List<String>> rhymes = Arrays.asList(
				Arrays.asList("JOHNNY","JOHNNY","YES","PAPA","EATING","SUGAR","NO","PAPA" ),
				Arrays.asList("TELLING","LIES","NO","PAPA"),
				Arrays.asList("OPEN","YOUR","MOUTH","HA","HA","HA")
				); 
	 List<String> collect = rhymes.stream().flatMap((List<String> rhyme) -> rhyme.stream().map((String s) -> s.toLowerCase())).collect(Collectors.toList());
	 System.out.println(collect);

	}

}
