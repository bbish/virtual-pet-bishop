public class VirtualPet {
    private int hunger;
    private int thirst;
    private int waste;
    private int timePassed;
    private String name;
    private boolean isDead;

    //constructor for Virtual Pet. Takes in 3 variables
    public VirtualPet(int inHunger, int inThirst, int inWaste, String inName) {
        hunger = inHunger;
        thirst = inThirst;
        waste = inWaste;
        timePassed = 0;
        name = inName;
        isDead = false;
    }

    //checks if hunger is less than 50
    public boolean isHungry() {
        return hunger <= 0;
    }

    //checks if thirst is less than 50
    public boolean isThirsty() {
        return thirst <= 0;
    }

    //checks if waste is greater than 50
    public boolean needToWaste() {
        return waste >= 80;
    }

    // tracks passage of time based on action
    public void tick() {
        timePassed ++;
        if (needToWaste()) {
            relieve();
        } else if (hunger >= 100 || thirst >= 100) {
            isDead = true;
        } else if (timePassed > 20) {
            isDead = true;
        }
    }

    public boolean getStatus() {
        return isDead;
    }

    //return time passage of time value
    public int getTimePassed() {
        return timePassed;
    }

    //return hunger value
    public int getHunger() {
        return hunger;
    }

    //return thirst value
    public int getThirst() {
        return thirst;
    }

    //return waste value
    public int getWaste() {
        return waste;
    }

    //decrease hunger and increase need to use the bathroom
    public void feed() {
        hunger -= 20;
        if (isHungry()) {
            hunger = 0;
            System.out.println("\nI'm good! I don't need anything else to eat.\n");
        } else {
            waste += 30;
            thirst += 10;
            timePassed++;
            tick();
        }
    }

    //decrease thirst and increase need to use the bathroom
    public void drink() {
        thirst -= 30;
        if (isThirsty()) {
            thirst = 0;
            System.out.println("\nI'm good! I don't need anything else to drink.\n");
        } else {
            waste += 20;
            hunger += 10;
            timePassed++;
            tick();
        }

    }

    //decrease need to use the bathroom
    public void relieve() {
        waste -= waste;
        hunger += 5;
        thirst += 5;
        tick();
    }

    //do nothing
    public void doNothing() {
        hunger+=10;
        thirst+=10 ;
        waste+=10;
        tick();
    }
}