public class OrganicDog extends OrganicPet implements Walkable{

    public OrganicDog(String inName, String inDescription) {
        super(inName, inDescription);
    }

    public void walk() {
        boredom -= 20;
        waste += 5;
        thirst +=5;
        hunger += 5;
    }
}
