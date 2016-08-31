package serenitylabs.tutorials.vetclinic.collections.katas;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Hotel;
import serenitylabs.tutorials.vetclinic.Pet;
public class WhenBookingPetsIntoAPetHotel {

	@Test
	public void the_hotel_should_initially_have_no_pets_booked() {
		Hotel pet_booked = new Hotel();
		assertThat(pet_booked.getPets().entrySet(), hasSize(0));

	}

	@Test
	public void should_be_able_to_check_a_pet_into_the_hotel() throws Exception {
		Hotel hotelBooking = new Hotel();
		Pet fido = Pet.dog().named("Fido11");
		hotelBooking.appointment(fido);
		assertThat(hotelBooking.getPets().keySet(), contains("Fido11"));
	}

	@Test
	public void should_be_able_to_check_in_several_pets() throws Exception {
		Hotel hotelBooking = new Hotel();
		Pet fido = Pet.dog().named("Fido");
		Pet felix = Pet.cat().named("Felix");
		hotelBooking.appointment(fido, felix);
		
		List<Pet> pets = new ArrayList<>(hotelBooking.getPets().values());
		assertThat(pets, contains(felix, fido));

	}

	@Test
	public void should_not_be_able_to_check_in_the_same_pet_twice() throws Exception {
		Hotel hotelBooking = new Hotel();
		Pet fido = Pet.dog().named("Fido");
		Pet felix = Pet.cat().named("Felix");
		// Pet felix2 = Pet.cat().named("Felix");
		hotelBooking.appointment(fido, felix, felix);
		assertThat(hotelBooking.getPets().entrySet(), hasSize(2));

	}

	@Test
	public void should_be_able_to_retrieve_checked_in_pets_in_alphabetical_order() throws Exception {

		Hotel hotelBooking = new Hotel();
		Pet fido = Pet.dog().named("Fido");
		Pet felix = Pet.cat().named("Felix");
		hotelBooking.appointment(fido, felix);
		assertThat(hotelBooking.getPetsByName().keySet(), contains("Felix", "Fido"));
	}

	@Test
	public void should_be_able_to_obtain_a_booking_confirmation_when_we_check_in_a_pet() throws Exception {
     //when
		Hotel hotelBooking = new Hotel();
		Pet fido = Pet.dog().named("Fido");
		hotelBooking.appointment(fido);
	//given
		
	//Then	
	}

	@Test
	@Ignore
	public void should_not_be_able_to_check_in_pets_beyond_hotel_capacity() throws Exception {
	}

	@Test
	@Ignore
	public void should_notify_owner_that_the_hotel_is_full() throws Exception {
	}

	@Test
	@Ignore
	public void should_place_pets_on_a_waiting_list_when_the_hotel_is_full() throws Exception {
	}

	@Test
	@Ignore
	public void pets_on_the_waiting_list_should_be_added_to_the_hotel_when_a_place_is_freed() throws Exception {
	}

	@Test
	@Ignore
	public void pets_on_the_waiting_list_should_be_admitted_on_a_first_come_first_served_basis() throws Exception {
	}

}
