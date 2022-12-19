package com.hp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program4 {

	public static void main(String[] args) {
		
		List <Integer > values =Arrays.asList(22,44,34,34,33,55);
		Predicate <Integer>p=new Predicate <Integer>() 
		{

			
			public boolean test(Integer i) {
				
				return i%5==0;
			}
			
		};
		System.out.println(values
				.stream()
				.filter(i->i%5==0)
				.reduce(0,(c,e)->c+e));
		
		
	}
}

