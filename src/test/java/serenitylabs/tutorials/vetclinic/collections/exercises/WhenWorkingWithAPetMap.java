package serenitylabs.tutorials.vetclinic.collections.exercises;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;

public class WhenWorkingWithAPetMap {

	@Test
	public void pets_can_be_found_by_their_name() {
		Map<String, Pet> pets = new HashMap<>();

		Pet fido = Pet.dog().named("Fido");

		pets.put("Fido", fido);

		assertThat("Fido", is(equalTo(fido.getName())));
	}

	@Test
	public void should_be_able_to_get_a_default_value_if_no_matching_key_is_present() {
		Map<String, Pet> pets = new HashMap<>();
		final Pet defaultPet = Pet.dog().named("Default Dog");
		Pet fido = Pet.dog().named("Fido");
		Pet stray = Pet.dog().named("Stray");

		pets.put("Fido", fido);
		pets.put("Stray", stray);

		assertThat(pets.getOrDefault("Maxi", defaultPet).getName(), is(equalTo(defaultPet.getName())));
		;

		// TODO
	}

	@Test
	public void the_map_keys_should_be_the_pet_names() {
		Map<String, Pet> pets = new HashMap<>();

		Pet fido = Pet.dog().named("Fido");
		Pet felix = Pet.cat().named("Felix");

		pets.put("Fido", fido);
		pets.put("Felix", felix);
		pets.forEach((key, pet) -> {
			assertThat(key, is(equalTo(pet.getName())));
		});

		// TODO
	}

	@Test
	public void the_map_should_store_pets_in_alphabetical_order() {
		// TODO: Instantiate the correct type of Map
		SortedMap<String, Pet> pets = new TreeMap<>();

		pets.put("Rover", Pet.dog().named("Rover"));
		pets.put("Felix", Pet.cat().named("Felix"));
		pets.put("Spot", Pet.cat().named("Spot"));

		assertThat(pets.keySet(), contains("Felix", "Rover", "Spot"));
	}

	@Test
	public void the_map_should_store_pets_in_the_order_they_where_added() {
		// TODO: Instantiate the correct type of Map
		Map<String, Pet> pets = new LinkedHashMap<String, Pet>();

		pets.put("Spot", Pet.cat().named("Spot"));
		pets.put("Rover", Pet.dog().named("Rover"));
		pets.put("Felix", Pet.cat().named("Felix"));
		pets.put("Fido", Pet.cat().named("Fido"));

		assertThat(pets.keySet(), contains("Spot", "Rover", "Felix", "Fido"));
	}

	@Test
	public void the_map_should_store_pet_leaders_by_breed() {
		// TODO: Create an EnumMap to define a pet leader for each breed
		EnumMap<Breed, Pet> petLeaders = new EnumMap<>(Breed.class);

		petLeaders.put(Breed.Cat, Pet.cat().named("Felix"));
		petLeaders.put(Breed.Dog, Pet.dog().named("Lassie"));
		petLeaders.put(Breed.Rabbit, Pet.cat().named("Hazel"));

		assertThat(petLeaders.get(Breed.Dog).getName(), equalTo("Lassie"));
	}

}
