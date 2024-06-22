package com.streams.operations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {
		Stream<String> rhymeStream = Stream.of("JOHNNY","JOHNNY","YES","PAPA","EATING","SUGAR","NO","PAPA" );
		List<String> collect = rhymeStream.filter((String s) -> s.length()>3).collect(Collectors.toList());
		System.out.println(collect);
	}

}
