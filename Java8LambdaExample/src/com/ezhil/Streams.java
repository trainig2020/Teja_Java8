package com.ezhil;

import java.util.Arrays;
import java.util.List;

public class Streams {
	
public static void main(String[] args) {
		
	List<Person> people = Arrays.asList(
			new Person("ezhil", "ellappan", 23),
			new Person("sandhiya", "ellappan", 20),
			new Person("rakshana", "Dhanapal", 20),
			new Person("anu", "Dhanush", 20)
		);
		
		/*
		 * people.stream() .filter(p -> p.getLastName().startsWith("G")) .forEach(p ->
		 * System.out.println(p.getFirstName()));
		 */
		
		/*
		 * long count = people.stream() .filter(p -> p.getLastName().startsWith("B"))
		 * .count();
		 * 
		 * System.out.println(count);
		 */
		
		long count = people.parallelStream()
				.filter(p -> p.getLastname().startsWith("B"))
				.count();
				
				System.out.println(count);
				

}

}