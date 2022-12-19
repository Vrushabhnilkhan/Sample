package com.hp;

import java.util.Arrays;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		
		List<Integer>values=Arrays.asList(10,20,30,40,50,60);
		int result=0;
		for(int i:values) {
			result= result +i;
		}
		System.out.println(result);
	}
}
