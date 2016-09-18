package serenitylabs.tutorials.vetclinic.screenplay.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.Step;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;

/**
 * Created by smejari on 9/16/2016.
 */
public class CheckOut implements Performable {

    private final Pet pet;
    private final PetHotel petHotel;


    public CheckOut(Pet pet, PetHotel petHotel) {
        this.pet=pet;
        this.petHotel=petHotel;

    }


    @Step("{0} checks #pet from #petHotel")
    @Override
    public <T extends Actor> void performAs(T t) {
        petHotel.checkOut(pet);
    }

    public static CheckInBuilder aPet(Pet ginger) {

        return new CheckInBuilder(ginger);
    }

    public static class CheckInBuilder
    {
        private final Pet pet;
        public CheckInBuilder(Pet pet)
        {
            this.pet=pet;
        }


        public Performable from(PetHotel petHotel) {
            return Instrumented.instanceOf(CheckOut.class).withProperties(pet,petHotel);

        }
    }
}
