import java.util.Random;

public class VirtualPet {
    protected String name;
    protected String description;
    protected int boredom;
    /*protected int hunger;
    protected int thirst;
    protected int waste;
    protected int timePassed;
    protected boolean isDead;*/



    Random rand = new Random();
    public VirtualPet(String inName, String inDescription) {
        description = inDescription;
        name = inName;
        boredom = rand.nextInt(70);

        /*hunger = rand.nextInt(70);
        thirst = rand.nextInt(70);
        waste = rand.nextInt(100);
        timePassed = 0;
        isDead = false;*/
    }
   /* public boolean isNotHungry() {
        return hunger <= 0;
    }
    public boolean isNotThirsty() {
        return thirst <= 0;
    }
    public boolean needToWaste() {
        return waste >= 80;
    }*/
    public boolean isNotBored() {
        return boredom <= 0;
    }

   /* public boolean getStatus() {
        return isDead;
    }
    public int getTimePassed() {
        return timePassed;
    }*/
   /* public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getWaste() {
        return waste;
    }*/
    public int getBoredom() {
        return boredom;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    /*public void feed() {

        hunger -= 20;
        if (isNotHungry()) {
            hunger = 0;
            System.out.println("\nPlease no more pizza...please..." + getName() + " is full\n");
        } *//*else {
            waste += 20;
            thirst += 10;
            timePassed++;
            tick();
        }*//*
    }
    public void drink() {

        thirst -= 20;
        if (isNotThirsty()) {
            thirst = 0;
            System.out.println("\n" + getName() + " is good! " + getName() +" doesn't need anything else to drink.\n");
        } *//*else {
            waste += 30;
            hunger += 10;
            timePassed++;
            tick();
        }*//*
    }
    public void relieve() {

        waste -= waste;
       *//* hunger += 5;
        thirst += 5;
        boredom += 5;
        tick();*//*
    }*/
    public void play() {

        boredom -= 20;
        if (isNotBored()) {
            System.out.println(getName() + " done playing. \n");
            boredom = 0;
        /*} else {
            waste += 5;
            thirst += 5;
            hunger += 5;
           tick()*/
        }
    }


    public void tick() {

    }
}