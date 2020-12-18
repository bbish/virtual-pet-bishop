public class RoboticPet extends VirtualPet{
    int oil;

    public RoboticPet(String inName, String inDescription) {
        super(inName, inDescription);
        oil = rand.nextInt(70);
    }

    public int getOil() {
        return oil;
    }

    public void maintenance (){
        oil += 20;
        if(oil > 100)
            oil = 100;
        /*if(oil > 100)
            oil = 100;

*/
    }
    @Override
    public void tick() {
        boredom += 5;
        oil -= 5;

        if(oil < 0)
            oil = 0;
        if(oil <= 50)
            System.out.println(getName() + " needs maintenance \n");
        if(boredom > 100)
            boredom = 100;
    }

}


