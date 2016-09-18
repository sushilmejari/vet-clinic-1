package serenitylabs.tutorials.vetclinic.screenplay;

import net.serenitybdd.screenplay.Actor;
import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;
import serenitylabs.tutorials.vetclinic.screenplay.questions.TheRegisterGuests;
import serenitylabs.tutorials.vetclinic.screenplay.tasks.CheckIn;
import serenitylabs.tutorials.vetclinic.screenplay.tasks.CheckOut;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

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
        petra.should(seeThat(TheRegisterGuests.in(petHotel),hasItem(ginger)));
    }

    @Test
    public void petra_checks_her_cat_out_of_the_hotel()
    {
        //GIVEN
        Actor petra =Actor.named("Petra The pet Owner");
        Pet ginger=Pet.cat().named("ginger");
        PetHotel petHotel=PetHotel.called("Dreams");
        petra.wasAbleTo(CheckIn.aPet(ginger).into(petHotel));
       //WHEN
        petra.attemptsTo(
                CheckOut.aPet(ginger).from(petHotel)
        );


        assertThat(petHotel.getPets(),not(hasItem(ginger)));
    }

}
