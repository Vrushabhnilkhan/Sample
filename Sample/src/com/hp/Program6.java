package com.hp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program6 {
public static void main(String[] args) {
	
	List <Integer > values =Arrays.asList(33,55,64,74,33,95);
	Predicate <Integer>p=new Predicate <Integer>() 
	{

		
		public boolean test(Integer i) {
			
			return i%5==0;
		}
		
	};
	System.out.println(values
			.stream()
			.filter(i->i%5==0)
			.map(i->i*2)
			.findFirst()
			.orElse(0));
}


}

