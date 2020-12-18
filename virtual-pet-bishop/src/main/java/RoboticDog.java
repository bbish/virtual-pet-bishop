public class RoboticDog extends RoboticPet implements Walkable {

    public RoboticDog(String inName, String inDescription) {
        super(inName, inDescription);

    }
   /* @Override
    public void maintenance (){
        oil -= 20;
       *//* if(oil < 0)
            oil = 0;*//*
    }*/


    public void walk() {
        oil -= 30;
        if(oil < 0)
            oil = 0;
        boredom -= 20;
    }
}
