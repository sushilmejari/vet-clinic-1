package serenitylabs.tutorials.vetclinic.screenplay.ability;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by smejari on 9/15/2016.
 */
public class WhenLookingForPetStoresOnGoogle {
    //GoogleSearchPage googleSearchPage;

    //@Managed(driver="chrome")
    //WebDriver petBrowser;

    @Test
    public void should_find_local_pet_store()
    {
       // Actor pete= Actor.named("Pete");

        //Given
      //  pete.attemptsTo(Open.browserOn().the(googleSearchPage),Enter.theValue("pet store").into(GoogleSearchPage.SEARCH_FIELD));

        //Then

       // pete.should( eventually(seeThat(TheWebPage.title(),containsString("pet stores"))));
    }
}
