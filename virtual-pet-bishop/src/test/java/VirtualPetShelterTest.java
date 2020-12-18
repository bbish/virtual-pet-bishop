/*package project;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;*/

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class VirtualPetShelterTest {



    VirtualPetShelter underTest = new VirtualPetShelter();
    VirtualPet testPet = new OrganicCat("Testy", "the 1st tested");
    VirtualPet testPet2 = new OrganicDog("Tested", "the 2nd test");
    VirtualPet testPet3 = new RoboticDog("Testier", "the 3rd tested");
    VirtualPet testPet4 = new RoboticCat("Testiest", "the 4th test");

    @Test
    public void addNewPetTest() {
        underTest.addPet(testPet);
        Collection<VirtualPet> pets = underTest.retrievePets();
        Assert.assertEquals(1, pets.size());
    }

    @Test
    public void add4NewPetTest() {
        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.addPet(testPet3);
        underTest.addPet(testPet4);
        Collection<VirtualPet> pets = underTest.retrievePets();
        Assert.assertEquals(4, pets.size());
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
        underTest.addPet(testPet3);
        underTest.addPet(testPet4);
        underTest.feedAllPets();
        Assert.assertTrue(((OrganicPet)testPet).getHunger() != 100);
        Assert.assertTrue(((OrganicPet)testPet2).getHunger() != 100);
    }

    @Test
    public void shouldBeAbleToHydrateAllPets() {

        underTest.addPet(testPet);
        underTest.addPet(testPet2);
        underTest.addPet(testPet3);
        underTest.addPet(testPet4);
        underTest.feedAllPets();
        Assert.assertTrue(((OrganicPet)testPet).getThirst() != 100);
        Assert.assertTrue(((OrganicPet)testPet2).getThirst() != 100);
    }

    @Test
    public void shouldBeAbleToTakePetToBathroom() {
        underTest.addPet(testPet);
        underTest.takeToBathroom("Testy");
        Assert.assertEquals(5,((OrganicPet)testPet).getWaste());

    }
    @Test
    public void shouldBeAbleToPlayWithAPet() {
        underTest.addPet(testPet);
        underTest.playWithPet("Testy");
        Assert.assertTrue(((OrganicPet)testPet).getBoredom() != 100);


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
        underTest.addPet(testPet);
        underTest.addPet(testPet3);
        int originalHunger = ((OrganicPet)testPet).getHunger();
        int originalThirst = ((OrganicPet)testPet).getThirst();
        int originalClean = ((OrganicPet)testPet).getCleanliness();
        int originalBoredom1 = ((OrganicPet)testPet).getBoredom();
        int originalBoredom2 = ((RoboticPet)testPet3).getBoredom();
        int originalOil = ((RoboticPet)testPet3).getOil();
        underTest.tickAllPets();

        Assert.assertTrue(originalHunger != ((OrganicPet)testPet).getHunger());
        Assert.assertTrue(originalThirst != ((OrganicPet)testPet).getThirst());
        Assert.assertTrue(originalClean != ((OrganicPet)testPet).getCleanliness());
        Assert.assertTrue(originalBoredom1 != ((OrganicPet)testPet).getBoredom());
        Assert.assertTrue(originalBoredom2 != ((RoboticPet)testPet3).getBoredom());
        Assert.assertTrue(originalOil != ((RoboticPet)testPet3).getOil());
    }
}