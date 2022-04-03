package com.java8practice.collections;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;



public class collections {
 public static void main(String args[]){
	 ArrayList<String> a1 = new ArrayList<>();
	 a1.add("Anil");
	 a1.add("Amol");
	 a1.add("Meera");
	 a1.add("Shyam");
	 a1.add("Vishnu");
	 
	 for (String N1:a1)
		 System.out.println(N1);
	 List<String> newNames = a1.stream().filter(e ->e.startsWith("A")).collect(Collectors.toList());
	 System.out.println(newNames);
	 
	 List<Integer> N2 = new ArrayList<>();
	 N2.add(15);
	 N2.add(17);
	 N2.add(26);
	 N2.add(28);
	 N2.add(38);
	 
	 for (int er:N2)
		 System.out.println(er);
	 List<Integer> N5 = N2.stream().map(i->i*i).collect(Collectors.toList());
	 System.out.println(N5);
	 
	 List<Integer> N6 = N5.stream().map(e->e+e+e).collect(Collectors.toList());
	 System.out.println(N6);
	 
	 List<Integer> N8 = N6.stream().filter(g->g>2300).collect(Collectors.toList());
	 System.out.println(N8);
	 
	 List<Integer> N12 = N8.stream().map(p->p%10+p%100+p%1000).collect(Collectors.toList());
	 System.out.println(N12);
	 
	 
	 
 }
}
