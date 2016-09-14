package serenitylabs.tutorials.vetclinic.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;

import java.util.List;

/**
 * Created by smejari on 9/14/2016.
 */
@Subject("The pets in the hotel")
public class TheRegisterGuests implements Question<List<Pet>> {
private final PetHotel petHotel;
    public TheRegisterGuests(PetHotel petHotel) {
        this.petHotel=petHotel;
    }

    @Override
    public List<Pet> answeredBy(Actor actor) {
        return petHotel.getPets();
    }

    public static Question<List<Pet>> in(PetHotel petHotel) {
        return new TheRegisterGuests(petHotel);
    }
}
