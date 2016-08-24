package serenitylabs.tutorials.vetclinic.collections.exercises;

import com.google.common.collect.Sets;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Set;

public class WhenWorkingWithASetOfPets {

	@Test
	public void should_add_Fido_to_the_set_of_pets() {
		Set<String> names = Sets.newHashSet();
		names.add("Fido");
		assertThat(names, hasItem("Fido"));
		// TODO
	}

	@Test
	public void a_set_of_pets_should_not_contain_duplicates() {
		Set<String> names = Sets.newHashSet();

		names.add("Fido");
		names.add("Felix");
		names.add("Fido");
		assertThat(names.size(), is(equalTo(2)));
		// TODO
	}

	@Test
	public void adding_several_pets() {
		Set<String> names = Sets.newHashSet("Fido", "Felix");

		names.addAll(Sets.newHashSet("Felix", "Spot"));
		assertThat(names.size(), is(equalTo(3)));

	}

}
