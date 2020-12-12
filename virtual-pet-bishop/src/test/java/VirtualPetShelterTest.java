/*package project;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;*/

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class VirtualPetShelterTest {
    /*
    To Do List:
    - Able to add pets
    - Able to remove a specific pet from shelter given it's name
    - Able to feed all pets in the shelter.
    - Able to tick all pets.
    - Return list of pets in shelter.
     */



    VirtualPetShelter underTest = new VirtualPetShelter();
    VirtualPet testPet = new VirtualPet("Testy", "the 1st tested");
    VirtualPet testPet2 = new VirtualPet("Tested", "the 2nd test");

    @Test
    public void addNewPetTest() {
        underTest.addPet(testPet);
        Collection<VirtualPet> pets = underTest.retrievePets();
        Assert.assertEquals(1, pets.size());
    }

    @Test
    public void removePetTest() {
        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.removePet("Testy");
        Collection<VirtualPet> pets = underTest.retrievePets();
        Assert.assertEquals(1, pets.size());
    }
    @Test
    public void shouldBeAbleToFeedAllPets() {

        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.feedAllPets();
        Assert.assertTrue(testPet.getHunger() != 100);
        Assert.assertTrue(testPet2.getHunger() != 100);
    }

    @Test
    public void shouldBeAbleToHydrateAllPets() {

        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.feedAllPets();
        Assert.assertTrue(testPet.getThirst() != 100);
        Assert.assertTrue(testPet2.getThirst() != 100);
    }

    @Test
    public void shouldBeAbleToTakePetToBathroom() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet(50, 50, 50, 50, "Testy", "the 1st tested");
        VirtualPet testPet2 = new VirtualPet(50, 50, 50, 50, "Tested", "the 2nd test");
        underTest.addPet(testPet);
        underTest.addPet(testPet2);

        underTest.takeToBathroom("Testy");
        Assert.assertEquals(0,testPet.getWaste());

    }
    @Test
    public void shouldBeAbleToPlayWithAPet() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet(50, 50, 50, 50, "Testy", "the 1st tested");
        VirtualPet testPet2 = new VirtualPet(50, 50, 50, 50, "Tested", "the 2nd test");
        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.playWithPet("Testy");
        underTest.playWithPet("Tested");

        Assert.assertEquals(30, testPet.getBoredom());

    }
    @Test
    public void shouldRetrievePetCollection() {

        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        Collection<VirtualPet> retrievePets = underTest.retrievePets();
        Assert.assertEquals(2,retrievePets.size());

    }

    @Test
    public void shouldTickAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Testy", "the 1st tested");
        VirtualPet testPet2 = new VirtualPet("Tested", "the 2nd test");
        underTest.addPet(testPet);
        underTest.addPet(testPet2);

        underTest.tickAllPets();
        int petTimepassed = testPet.getTimePassed();

        Assert.assertEquals(1, petTimepassed);
    }
}