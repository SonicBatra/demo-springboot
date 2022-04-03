package com.java8practice.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

	
	public static void main(String[] args) {
		System.out.println("Starts here now");
	
		ArrayList<Integer> numberList 
	    = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

	Consumer<Integer> action = i -> {
	    if (i % 2 == 0) {
	        System.out.println("Even number :: " + i); //Or any other user action we want to do
	    } else {
	        System.out.println("Odd  number :: " + i);  //Or any other user action we want to do
	    }
	};

	numberList.stream()
	    .forEach(action);
		}
		
	}
			
		
		
		
	


