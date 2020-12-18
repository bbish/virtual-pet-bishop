import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class VirtualPetShelter {

    protected Map<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet petToAdd) {
        pets.put(petToAdd.getName(), petToAdd);
        tickAllPets();
    }
    public void removePet(String petName) {
        VirtualPet chosen = pets.get(petName);
        if(chosen != null) {
            pets.remove(petName);
            tickAllPets();
        }
    }
    public void feedAllPets() {
        System.out.println("// \"\"--.._\n" +
                "||  (_)  _ \"-._\n" +
                "||    _ (_)    '-.\n" +
                "||   (_)   __..-'\n" +
                " \\\\__..--\"\"");
        System.out.println(" ");

        for (VirtualPet i : retrievePets()) {
            if(i instanceof OrganicPet) {
                ((OrganicPet) i).feed();
            }
        }
        tickAllPets();
    }
    public void allPetsDrink() {
        System.out.println("  .\n" +
                "  .\n" +
                " . .\n" +
                "  ...\n" +
                "\\~~~~~/\n" +
                " \\   /\n" +
                "  \\ /\n" +
                "   V\n" +
                "   |\n" +
                "   |\n" +
                "  ---");
        System.out.println(" ");
        System.out.println("Guess that's one way to hydrate. \n");

        for (VirtualPet i : retrievePets()) {
            if(i instanceof OrganicPet)
                ((OrganicPet)i).drink();
        }
        tickAllPets();
    }
    public void playWithPet(String petName) {
         VirtualPet chosen = pets.get(petName);
        if(chosen != null) {

            System.out.println("  _____\n" +
                    "         |A .  | _____\n" +
                    "         | /.\\ ||A ^  | _____\n" +
                    "         |(_._)|| / \\ ||A _  | _____\n" +
                    "         |  |  || \\ / || ( ) ||A_ _ |\n" +
                    "         |____V||  .  ||(_'_)||( v )|\n" +
                    "                |____V||  |  || \\ / |\n" +
                    "                       |____V||  .  |\n" +
                    "                              |____V|\n");

            chosen.play();
            tickAllPets();
        }
        else
            System.out.println("That pet isn't here! \n");
    }

    public void takeToBathroom(String petName) {

        VirtualPet chosen = pets.get(petName);
        if(chosen instanceof OrganicPet) {
            System.out.println("  .--\"\"--.___.._\n" +
                    " (  <__>  )     `-.\n" +
                    " |`--..--'|      <|\n" +
                    " |       :|       /\n" +
                    " |       :|--\"\"-./\n" +
                    " `.__  __;' \n" +
                    "     \"\"     ");
            ((OrganicPet)chosen).relieve();
            tickAllPets();
        }
        else
            System.out.println("That pet isn't available to pee! \n");
    }

    public void takeOnAWalk(String petName) {

        VirtualPet chosen = pets.get(petName);
        if(chosen instanceof RoboticDog) {
            ((RoboticDog)chosen).walk();
            tickAllPets();
        } else if (chosen instanceof OrganicDog) {
            ((OrganicDog)chosen).walk();
            tickAllPets();
        }
        else
            System.out.println("That pet isn't available for a walk! \n");
    }

    public void cleanOrganicPet(String petName) {

        VirtualPet chosen = pets.get(petName);
        if(chosen instanceof OrganicPet) {
            System.out.println(" ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||\n" +
                    "  ||     Here you go, sweep\n" +
                    "  ||     that up..............\n" +
                    " /||\\\n" +
                    "/||||\\\n" +
                    "======         __|__\n" +
                    "||||||        / ~@~ \\\n" +
                    "||||||       |-------|\n" +
                    "||||||       |_______|");
            ((OrganicPet)chosen).clean();
            tickAllPets();
        }
        else
            System.out.println("That pet isn't available for cleaning! \n");
    }

    public void oilRobotPet(String petName) {

        VirtualPet chosen = pets.get(petName);
        if(chosen instanceof RoboticPet) {
            ((RoboticPet)chosen).maintenance();
            tickAllPets();
        }
        else
            System.out.println("That pet isn't available for maintenance! \n");
    }
    public void tickAllPets(){
        //ArrayList<VirtualPet> deadPets = new ArrayList<VirtualPet>();
        for (VirtualPet i : retrievePets()){
            i.tick();
            /*if(i.getStatus())
                deadPets.add(i);*/
        }
        /*for(int i=0; i<deadPets.size(); i++) {
            removePet(deadPets.get(i).getName());
            System.out.println(deadPets.get(i).getName() + " died. Please take better care of the pets" );
        }*/
    }
    public void petStatus() {
        for (VirtualPet i : retrievePets()) {
            if(i instanceof OrganicPet) {
                System.out.println(i.getName() + "\t\t " + ((OrganicPet) i).getHunger() + "\t\t \t " + ((OrganicPet) i).getThirst() + "\t\t  "
                        + ((OrganicPet) i).getWaste() + "\t\t\t" + i.getBoredom() + "\t\t\t\t\t" + ((OrganicPet) i).getCleanliness());
            } else if (i instanceof RoboticPet) {
                System.out.println(i.getName() + "\t\t\t\t\t\t\t\t\t\t\t\t" + i.getBoredom() + "\t\t\t\t\t\t" + ((RoboticPet)i).getOil());
            }
        }
    }

    public Collection<VirtualPet> retrievePets(){
        return pets.values();
    }



    public String listOfAllPets(){
        String allPets= "";
        for(VirtualPet i : retrievePets()){
            allPets += i.getName() + " " + i.getDescription() + "\n";
        }
        return allPets;
    }

    public String listOfAllOrganicPets(){
        String allPets= "";
        for(VirtualPet i : retrievePets()){
            if(i instanceof OrganicPet)
                allPets += i.getName() + " " + i.getDescription() + "\n";
        }
        return allPets;
    }


    public String listOfAllRoboticPets(){
        String allPets= "";
        for(VirtualPet i : retrievePets()){
            if(i instanceof RoboticPet)
                allPets += i.getName() + " " + i.getDescription() + "\n";
        }
        return allPets;
    }




}