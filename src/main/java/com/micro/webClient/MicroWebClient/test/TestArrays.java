package com.micro.webClient.MicroWebClient.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrays {

	public static void main(String[] args) {
		
		//Integer a [] = new Integer[] {-5,1,2,3,1,-2,-3,1,-1,-6,-6,6,5};
		Integer a [] = new Integer[] {1,2,3,5, -1, 1};
				
		List<Integer> integerList= Arrays.asList(a);
		List<Integer> result= new ArrayList<Integer>();		
		
		System.out.println();
		for (Integer integer : integerList) {
			for (Integer integer2 : integerList) {
				if(integer2 > 0 && integer<0) {
					if(integer2 == (integer*-1)) {
						result.add(integer2);					
					}
				}
			}
		}
		
		result.removeAll(result.stream().filter(i -> (Collections.frequency(result, i) > 1)).collect(Collectors.toList()));
		System.out.println("************");
		result.stream().forEach(System.out::println);
		
		Integer[] response = result.stream().toArray(Integer[]::new);
		
		
		System.out.println("response: "+Arrays.toString(response));
	}
	
	

}
