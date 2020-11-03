package com.ezhil;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
					new Person("ezhil", "ellappan", 23),
					new Person("sandhiya", "ellappan", 20),
					new Person("rakshana", "Dhanapal", 20),
					new Person("anu", "Dhanush", 20)
				);

		//1.Sort list by last name
		Collections.sort(people, (p1,p2) -> p1.getLastname().compareTo(p2.getLastname()));
		
		//2.Print All
		System.out.println("All Persons : ");
		for(Person p : people) {
			System.out.println(p);
		}
		
		//3.Get person with specific lastname 
		System.out.println("\nPerson with lastname 'D'");
		printWithCond(people, (p) -> p.getLastname().startsWith("D"));
		
	}	
	/*
	 * private static void printWithCond(List<Person> people, Condition cond) {
	 * for(Person p: people) { if(cond.test(p)) { System.out.println(p); } } }
	 * 
	 * interface Condition{ boolean test(Person p); }
	 */
	
		private static void printWithCond(List<Person> people, Predicate<Person> pred) {
			for(Person p: people) {
				if(pred.test(p)) {
					System.out.println(p);
				}
			}
		}

}
