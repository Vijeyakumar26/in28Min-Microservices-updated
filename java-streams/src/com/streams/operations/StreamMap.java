package com.streams.operations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		Stream<String> rhymeStream = Stream.of("JOHNNY","JOHNNY","YES","PAPA","EATING","SUGAR","NO","PAPA" );
		List<String> collect = rhymeStream.map((String s) -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
