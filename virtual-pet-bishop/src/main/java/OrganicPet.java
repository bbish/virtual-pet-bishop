public class OrganicPet extends VirtualPet{

    int hunger;
    int thirst;
    int waste;
    int cleanliness;


    public OrganicPet(String inName, String inDescription) {
        super(inName, inDescription);
        hunger = rand.nextInt(70);
        thirst = rand.nextInt(70);
        waste = rand.nextInt(70);
        cleanliness = rand.nextInt(70);
    }

    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getWaste() {
        return waste;
    }
    public int getCleanliness() {
        return cleanliness;
    }

    public void feed() {

        hunger -= 20;
        if ( hunger <= 0) {
            hunger = 0;
            System.out.println("\nPlease no more pizza...please..." + getName() + " is full\n");
        }
    }
    public void drink() {

        thirst -= 20;
        if (thirst <= 0) {
            thirst = 0;
            System.out.println("\n" + getName() + " is good! " + getName() +" doesn't need anything else to drink.\n");
        }
    }
    public void relieve() {
        waste -= waste;
    }

    public void clean() {
        cleanliness -= cleanliness;
    }



    @Override
    public void tick() {
        hunger += 5;
        thirst += 5;
        waste += 5;
        boredom += 5;
        cleanliness += 5;

        if(hunger > 100)
            hunger = 100;
        if(thirst > 100)
            thirst = 100;
        if(waste > 100)
            waste = 100;
        if(boredom > 100)
            boredom = 100;
        if(cleanliness > 100)
            cleanliness = 100;

        /*if(environment >= 80)
            System.out.println(getName() + " needs it's living quarters cleaned!");
*/
    }
}
