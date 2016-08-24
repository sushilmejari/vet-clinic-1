package serenitylabs.tutorials.vetclinic.collections.exercises;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Pet;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;
import java.util.LinkedList;
import java.util.Queue;

public class WhenWorkingWithAPetQueue {

	@Test
	public void should_add_Fido_to_the_end_of_the_queue() {
		Queue<Pet> waitingList = new LinkedList<>();
		waitingList.add(Pet.cat().named("Felix"));
		waitingList.add(Pet.dog().named("Fido"));
		Pet currentPet = waitingList.poll();
		assertThat(currentPet.getName(), is(equalTo("Felix")));
	}

	@Test
	public void should_see_who_is_at_the_top_of_the_queue_without_removing_it() {
		Queue<Pet> waitingList = new LinkedList<>();

		waitingList.add(Pet.cat().named("Felix"));
		waitingList.add(Pet.dog().named("Fido"));
		Pet currentPet = waitingList.peek();

		assertThat(currentPet.getName(), is(equalTo("Felix")));
		// TODO
	}

}
