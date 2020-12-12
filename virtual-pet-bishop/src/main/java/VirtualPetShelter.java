import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class VirtualPetShelter {

    protected Map<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet petToAdd) {
        pets.put(petToAdd.getName(), petToAdd);
    }
    public void removePet(String petName) {
        VirtualPet chosen = pets.get(petName);
        if(chosen != null) {
            pets.remove(petName);
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
            i.feed();
        }
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
            i.drink();
        }
    }
    public void playWithPet(String petName) {
        System.out.println("  _____\n" +
                "         |A .  | _____\n" +
                "         | /.\\ ||A ^  | _____\n" +
                "         |(_._)|| / \\ ||A _  | _____\n" +
                "         |  |  || \\ / || ( ) ||A_ _ |\n" +
                "         |____V||  .  ||(_'_)||( v )|\n" +
                "                |____V||  |  || \\ / |\n" +
                "                       |____V||  .  |\n" +
                "                              |____V|\n");

        VirtualPet chosen = pets.get(petName);
        if(chosen != null) {
            chosen.play();
        }
        else
            System.out.println("That pet isn't here! \n");
    }

    public void takeToBathroom(String petName) {
        System.out.println("______     _   _          ______                _    \n" +
                "| ___ \\   | | | |         | ___ \\              | |   \n" +
                "| |_/ /__ | |_| |_ _   _  | |_/ /_ __ ___  __ _| | __\n" +
                "|  __/ _ \\| __| __| | | | | ___ \\ '__/ _ \\/ _` | |/ /\n" +
                "| | | (_) | |_| |_| |_| | | |_/ / | |  __/ (_| |   < \n" +
                "\\_|  \\___/ \\__|\\__|\\__, | \\____/|_|  \\___|\\__,_|_|\\_\\\n" +
                "                    __/ |                            \n" +
                "                   |___/                         ");
        System.out.println(" ");

        VirtualPet chosen = pets.get(petName);
        if(chosen != null) {
            chosen.relieve();
        }
        else
            System.out.println("That pet isn't here! \n");
    }
    public void tickAllPets(){
        ArrayList<VirtualPet> deadPets = new ArrayList<VirtualPet>();
        for (VirtualPet i : retrievePets()){
            i.tick();
            if(i.getStatus())
                deadPets.add(i);
        }
        for(int i=0; i<deadPets.size(); i++) {
            removePet(deadPets.get(i).getName());
            System.out.println(deadPets.get(i).getName() + " died. Please take better care of the pets" );
        }
    }
    public void petStatus() {
        for (VirtualPet i : retrievePets()) {
            //look up printf
            System.out.println(i.getName() + "\t\t " + i.getHunger() + "\t\t  "  + i.getThirst() + "\t\t  "  + i.getWaste()
                    + "\t\t\t" + i.getBoredom());
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

    public VirtualPet retrievePet(String petName){
        return pets.get(petName);
    }

}