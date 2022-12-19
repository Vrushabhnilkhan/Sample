package com.hp;

import java.util.Arrays;
import java.util.List;

public class Program7 {

	public static void main(String[] args) {
		
		List <Integer > values =Arrays.asList(33,55,64,74,33,95);
		int result =0;
		for (int i:values) {
			if(i%5==0) {
				result =i*2;
				break;
			}
		}
		System.out.println(result);
		System.out.println(values
				.stream()
				.filter(i->i%5==0)
				.map(i->i*2)
				.findFirst()
				.orElse(0));
	}
}
