package serenitylabs.tutorials.vetclinic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hotel {

	Map<String, Pet> pets;
	public static final int MAX_PETS = 10;
	public static int MIN_PETS = 0;

	public Hotel() {
		super();
		this.pets = new HashMap<>();
	}

	public Map<String, Pet> getPets() {

		return this.pets;
	}

	public Map<String, Pet> getPetsByName() {
		Map<String, Pet> sorteMap = new TreeMap<>(pets);
		return this.pets = sorteMap;
	}

	public void setPets(Map<String, Pet> pets) {
		this.pets = pets;
	}

	public void appointment(Pet... pets) throws Exception {
		if (this.pets.size() + pets.length <= MAX_PETS) {
			for (int i = 0; i < pets.length; i++) {
				this.pets.put(pets[i].getName(), pets[i]);
			}
		} else {
			throw new Exception();
		}
	}

}
