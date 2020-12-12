import java.util.Random;

public class VirtualPet {
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int waste;
    private int timePassed;
    private int boredom;
    private boolean isDead;


    public VirtualPet(int inHunger, int inThirst, int inWaste, int inBoredom, String inName, String inDescription) {
        description = inDescription;
        name = inName;
        hunger = inHunger;
        thirst = inThirst;
        waste = inWaste;
        boredom = inBoredom;
        timePassed = 0;
        isDead = false;
    }

    Random rand = new Random();
    public VirtualPet(String inName, String inDescription) {
        description = inDescription;
        name = inName;
        hunger = rand.nextInt(100);
        thirst = rand.nextInt(100);
        waste = rand.nextInt(100);
        boredom = rand.nextInt(100);
        timePassed = 0;
        isDead = false;
    }
    public boolean isHungry() {
        return hunger <= 0;
    }
    public boolean isThirsty() {
        return thirst <= 0;
    }
    public boolean needToWaste() {
        return waste >= 80;
    }
    public boolean isBored() {
        return boredom <= 0;
    }

    public boolean getStatus() {
        return isDead;
    }
    public int getTimePassed() {
        return timePassed;
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
    public int getBoredom() {
        return boredom;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public void feed() {

        hunger -= 20;
        if (isHungry()) {
            hunger = 0;
            System.out.println("\nPlease no more pizza...please..." + getName() + " is full\n");
        } else {
            waste += 20;
            thirst += 10;
            timePassed++;
            tick();
        }
    }
    public void drink() {

        thirst -= 20;
        if (isThirsty()) {
            thirst = 0;
            System.out.println("\n" + getName() + " is good! " + getName() +" doesn't need anything else to drink.\n");
        } else {
            waste += 30;
            hunger += 10;
            timePassed++;
            tick();
        }
    }
    public void relieve() {

        waste -= waste;
        hunger += 5;
        thirst += 5;
        boredom += 5;
        tick();
    }
    public void play() {

        boredom -= 20;
        if (isBored()) {
            System.out.println(getName() + " is all out of chips. \n");
            boredom = 0;
        } else {
            waste += 5;
            thirst += 5;
            hunger += 5;
            tick();
        }
    }

    public void tick() {
        timePassed++;
        if (needToWaste()) {
            relieve();
            System.out.println(getName() + " just peed \n");
        } else if (hunger >= 100 || thirst >= 100) {
            isDead = true;
        }
    }
}