import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

    @Test
    public void shouldBeHungry() {
            VirtualPet pet = new VirtualPet(0, 45, 100, "Harry");
            boolean hunger = pet.isHungry();
            Assert.assertEquals(true, hunger);
    }

    @Test
    public void shouldBeThirsty() {
        VirtualPet pet = new VirtualPet(40, 0, 100, "Harry");
        boolean thirst = pet.isThirsty();
        Assert.assertEquals(true, thirst);
    }

    @Test
    public void shouldNeedToUseBathroom() {
        VirtualPet pet = new VirtualPet(40, 45, 89, "Harry");
        boolean waste = pet.needToWaste();
        Assert.assertEquals(true, waste);
    }

    @Test
    public void isHungerCorrect() {
        VirtualPet pet = new VirtualPet(40, 45, 22, "Harry");
        int hunger = pet.getHunger();
        Assert.assertEquals(40, hunger);
    }

    @Test
    public void isThirstCorrect() {
        VirtualPet pet = new VirtualPet(40, 45, 22, "Harry");
        int thirst = pet.getThirst();
        Assert.assertEquals(45, thirst);
    }

    @Test
    public void isWasteCorrect() {
        VirtualPet pet = new VirtualPet(40, 45, 22, "Harry");
        int waste = pet.getWaste();
        Assert.assertEquals(22, waste);
    }

    @Test
    public void wasFeedSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22, "Harry");
        pet.feed();
        int hunger = pet.getHunger();
        Assert.assertEquals(20, hunger);
    }

    @Test
    public void wasDrinkSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22, "Harry");
        pet.drink();
        int thirst = pet.getThirst();
        Assert.assertEquals(15, thirst);
    }

    @Test
    public void wasWasteSuccessful() {
        VirtualPet pet = new VirtualPet(40, 45, 22, "Harry");
        pet.relieve();
        int waste = pet.getWaste();
        Assert.assertEquals(0, waste);
    }

    @Test
    public void didTheCorrectTIme() {
        VirtualPet pet = new VirtualPet(40, 45, 22, "Harry");
        pet.tick();
        int timePassed = pet.getTimePassed();
        Assert.assertEquals(1, timePassed);
    }
}
