
import java.util.Scanner;
public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playGame = true;
        String petChoice;

        System.out.println("Welcome to the CSB Animal Shelter!");
        System.out.println();
        System.out.println("Find a pet! Take em home! Feed em, hydrate em and play with em too!");
        System.out.println();

        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet tedTheTurtle = new VirtualPet( "Teddy", "turtle");
        VirtualPet robinTheRobin = new VirtualPet("Robinn", "robin");
        VirtualPet marshallTheMuskrat = new VirtualPet("Marsh", "muskrat");
        VirtualPet lillyTheLeopardGecko = new VirtualPet("Lilly", "gecko");
        VirtualPet barneyTheBarnacle = new VirtualPet("Barney", "barnacle");
        shelter.addPet(tedTheTurtle);
        shelter.addPet(robinTheRobin);
        shelter.addPet(marshallTheMuskrat);
        shelter.addPet(lillyTheLeopardGecko);
        shelter.addPet(barneyTheBarnacle);

        while(playGame) {
            System.out.println("Name \t |Hunger \t |Thirst \t |Bladder \t |Boredom");
            System.out.println("------|-----------|-----------|-----------|--------");
            shelter.petStatus();
            System.out.println();

            System.out.println("What would you like to do next?");
            System.out.println();
            System.out.println("Enter 1 to give food to all of the pets!");
            System.out.println("Enter 2 to give a drink to all of the pets!");
            System.out.println("Enter 3 to select a pet to use the bathroom!");
            System.out.println("Enter 4 to select a pet to play with");
            System.out.println("Enter 5 to adopt a pet");
            System.out.println("Enter 6 to admit a new pet");
            System.out.println("Enter 7 to leave");
            System.out.println();

            String userInput = input.nextLine();
            if (userInput.equals("1")) {
                shelter.feedAllPets();
                shelter.tickAllPets();
            }
            else if (userInput.equals("2")) {
                shelter.allPetsDrink();
                shelter.tickAllPets();
            } else if (userInput.equals("3")) {
                System.out.println("Which pet would you like to take out?");
                System.out.println(shelter.listOfAllPets());
                petChoice = input.nextLine();
                shelter.takeToBathroom(petChoice);
                shelter.tickAllPets();
            } else if (userInput.equals("4")) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(shelter.listOfAllPets());
                petChoice = input.nextLine();
                shelter.playWithPet(petChoice);
                shelter.tickAllPets();
            } else if (userInput.equals("5")) {
                System.out.println("Which pet would you like to adopt?");
                System.out.println(shelter.listOfAllPets());
                petChoice = input.nextLine();
                shelter.removePet(petChoice);
                System.out.println("Enjoy your new friend \n");
                shelter.tickAllPets();
            } else if (userInput.equals("6")) {
                //code to admit new pet
                System.out.println("What is the pet's name?");
                String newPetName = input.nextLine();
                System.out.println("Describe the pet.");
                String newPetDescription = input.nextLine();
                VirtualPet newPet = new VirtualPet(newPetName, newPetDescription);
                shelter.addPet(newPet);
            } else if (userInput.equals("7")) {
                System.out.println("Thanks for visiting the shelter. See you next time!");
                playGame = false;
            }

        }
    }
}