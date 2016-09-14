package serenitylabs.tutorials.vetclinic.screenplay;

import net.serenitybdd.screenplay.Actor;
import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;
import serenitylabs.tutorials.vetclinic.screenplay.tasks.CheckIn;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

/**
 * Created by smejari on 9/14/2016.
 */

@RunWith(SerenityRunner.class)
public class WhenCheckingInToPetHotel {

    @Test
    public void petra_books_her_pet_cat_into_the_hotel()
    {
        //Given
        Actor petra = Actor.named("Petra the pet Owner");
        Pet ginger = Pet.cat().named("Ginger");
        PetHotel petHotel = new PetHotel("Grand");
        //When
        petra.attemptsTo(
              //  new CheckIn(ginger,petHotel)
                CheckIn.aPet(ginger).into(petHotel)
        );
        //Then
        assertThat(petHotel.getPets(), hasItem(ginger) );
    }

}
