package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	private static long count;

	public static void main(String[] args) {
		
		List<Integer> salaryList = new ArrayList<>();
		salaryList.add(35999);
		salaryList.add(39999);
		salaryList.add(75999);
		salaryList.add(65999);
		salaryList.add(45999);
		salaryList.add(3999);
		salaryList.add(3991);
		
		count = salaryList.stream().filter((Integer sal) -> sal>59000).count();
		System.out.println(count);
	}

}
