package serenitylabs.tutorials.vetclinic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.SortedMap;
import java.util.TreeMap;
import static java.util.Comparator.comparing;

public class Main {

	public static void main(String[] args) {
		Comparator<Pet> cmpName = (d1, d2) -> d1.getName().compareTo(d2.getName());

		// final Comparator<Pet> BY_NAME = comparing(Pet::getName);
		Queue<Pet> waitingList = new LinkedList<>();

		waitingList.add(Pet.cat().named("Felix"));
		waitingList.add(Pet.dog().named("Fido"));

		Pet pet = waitingList.peek();
		System.out.println(pet);
		System.out.println(waitingList);

	}

}
