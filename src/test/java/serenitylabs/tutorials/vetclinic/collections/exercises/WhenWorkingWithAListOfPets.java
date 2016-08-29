package serenitylabs.tutorials.vetclinic.collections.exercises;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import serenitylabs.tutorials.vetclinic.Pet;

public class WhenWorkingWithAListOfPets {

	@Test
	public void should_store_a_list_of_pets() {

		List<Pet> pets = new ArrayList<>();

		pets.add(Pet.cat().named("Felix"));
		pets.add(Pet.dog().named("Fido"));

		assertThat(pets, hasItem(Pet.dog().named("Fido")));
	}
}
