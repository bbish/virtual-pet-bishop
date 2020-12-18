/*
import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

    @Test
    public void shouldBeHungry() {
            VirtualPet pet = new VirtualPet(0, 45, 100, 60,"Harry", "is cool");
            boolean hunger = pet.isHungry();
            Assert.assertEquals(true, hunger);
    }

    @Test
    public void shouldBeThirsty() {
        VirtualPet pet = new VirtualPet(40, 0, 100, 60,"Harry", "is cool");
        boolean thirst = pet.isThirsty();
        Assert.assertEquals(true, thirst);
    }

    @Test
    public void shouldNeedToUseBathroom() {
        VirtualPet pet = new VirtualPet("Harry", "is super cool");
        boolean waste = pet.needToWaste();
        Assert.assertEquals(true, waste);
    }

    @Test
    public void isHungerCorrect() {
        VirtualPet pet = new VirtualPet("Harry", "is cool");
        int hunger = pet.getHunger();
        Assert.assertEquals(40, hunger);
    }

    @Test
    public void isThirstCorrect() {
        VirtualPet pet = new VirtualPet(40, 45, 22, 50,"Harry", "is cool");
        int thirst = pet.getThirst();
        Assert.assertEquals(45, thirst);
    }

    @Test
    public void isWasteCorrect() {
        VirtualPet pet = new VirtualPet(40, 45, 22, 50, "Harry", "is cool");
        int waste = pet.getWaste();
        Assert.assertEquals(22, waste);
    }

    @Test
    public void wasFeedSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22, 50, "Harry", "is cool");
        pet.feed();
        int hunger = pet.getHunger();
        Assert.assertEquals(20, hunger);
    }

    @Test
    public void wasDrinkSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22, 50, "Harry", "is cool");
        pet.drink();
        int thirst = pet.getThirst();
        Assert.assertEquals(15, thirst);
    }

    @Test
    public void wasWasteSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22, 30, "Harry", "is cool");
        pet.relieve();
        int waste = pet.getWaste();
        Assert.assertEquals(0, waste);
    }

    @Test
    public void didTheCorrectTIme() {
        VirtualPet pet = new VirtualPet(40, 45, 22, 50, "Harry", "is cool");
        pet.tick();
        int timePassed = pet.getTimePassed();
        Assert.assertEquals(1, timePassed);
    }
}
*/
