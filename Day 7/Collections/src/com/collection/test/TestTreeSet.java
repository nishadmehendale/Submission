package com.collection.test;

import java.util.TreeSet;

import com.collection.application.Car;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<>();

		treeset.add("Sayali");
		treeset.add("Siddhi");
		treeset.add("Nishad");
		treeset.add("Drishti");
		treeset.add("Anindya");

		treeset.stream().forEach((name) -> System.out.println(name));

		TreeSet<Car> car = new TreeSet<>();

		car.add(new Car("Toyota", "Etios", 20010, 230000));
		car.add(new Car("BMW", "4567", 2014, 470000));
		car.add(new Car("Audi", "8", 2017, 2023000));

		car.stream().forEach((name) -> System.out.println(name));
	}
}