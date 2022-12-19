package com.hp;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Program2 {

	
	
		public static void main(String[] args) 
		{
			List<Integer> values=Arrays.asList(1,2,3,4,5,6);
			
				values.forEach(System.out::println);
		}
}