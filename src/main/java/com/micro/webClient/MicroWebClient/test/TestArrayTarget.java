package com.micro.webClient.MicroWebClient.test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestArrayTarget {
	
	public static void main(String[] args) {
		IntStream.range(1, 10).forEach(System.out::println);
		System.out.println("=====================================");
		IntStream.range(1, 10).skip(5).forEach(System.out::println);
		System.out.println("=====================================");
		System.out.println(IntStream.range(1, 10).sum());
		
		//*****************************************************
		System.out.println("=====================================");
		System.out.println("=====================================");
		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);
	}

}
