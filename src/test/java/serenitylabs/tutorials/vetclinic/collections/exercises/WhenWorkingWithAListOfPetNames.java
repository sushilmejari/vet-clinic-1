package serenitylabs.tutorials.vetclinic.collections.exercises;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.google.common.collect.Lists;

public class WhenWorkingWithAListOfPetNames {

	@Test
	public void should_add_Fido_to_the_list_of_pets() {
		List<String> names = Lists.newArrayList();
		names.add("Fido");
		names.add("Flexi");
		assertThat(names, hasItems("Fido"));
	}

	@Test
	public void should_remove_Fido_from_the_list_of_pets() {
		List<String> names = Lists.newArrayList("Felix", "Fido", "Spot");
		names.removeIf(s -> s.contains("Fido"));
		assertThat(names, hasItems("Felix", "Spot"));
	}

	@Test
	public void should_remove_the_first_pet_from_the_list_of_pets() {
		List<String> names = Lists.newArrayList("Felix", "Fido", "Spot");
		names.remove(0);
		assertThat(names, hasItems("Fido", "Spot"));
	}

	@Test
	public void should_make_a_list_of_cats_and_dogs() {
		List<String> cats = Lists.newArrayList("Felix", "Spot");
		List<String> dogs = Lists.newArrayList("Fido", "Rover");
		List<String> catsAndDogs = Stream.concat(cats.stream(), dogs.stream()).distinct().collect(Collectors.toList());
		assertThat(catsAndDogs, hasItems("Felix", "Spot", "Fido", "Rover"));
	}

	@Test
	public void should_put_the_dogs_among_the_cats() {
		List<String> cats = Lists.newArrayList("Felix", "Spot");
		List<String> dogs = Lists.newArrayList("Fido", "Rover");
		List<String> catsAndDogs = new ArrayList<>();
		catsAndDogs.addAll(cats);
		catsAndDogs.addAll(dogs);
		assertThat(catsAndDogs, hasItems("Felix", "Fido", "Rover", "Spot"));
	}

	@Test
	public void should_organise_pets_in_alphabetical_order() {
		List<String> pets = Lists.newArrayList("Felix", "Spot", "Fido", "Rover");

		Collections.sort(pets, (p1, p2) -> p1.toString().compareTo(p2.toString()));

		assertThat(pets, hasItems("Felix", "Fido", "Rover", "Spot"));
	}

	@Test
	public void should_organise_pets_in_reverse_alphabetical_order() {

		List<String> pets = Lists.newArrayList("Felix", "Spot", "Fido", "Rover");
		Collections.sort(pets, (p1, p2) -> p2.toString().compareTo(p1.toString()));
		assertThat(pets, hasItems("Spot", "Rover", "Fido", "Felix"));
	}

	@Test
	public void should_organise_pets_by_name_length() {
		List<String> pets = Lists.newArrayList("Felix", "Alfred", "Spot");
		Collections.sort(pets, (p1, p2) -> Integer.compare(p1.length(), p2.length()));
		assertThat(pets, hasItems("Spot", "Felix", "Alfred"));
	}

}
