
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
        VirtualPet pet1 = new OrganicCat("Teddy", "a fluffy siamese cat");
        VirtualPet pet2 = new OrganicDog("Robinn", "a ferocious lab");
        VirtualPet pet3 = new RoboticDog("Marsh", "a shiny dog");
        VirtualPet pet4 = new RoboticCat("Lilly", "a rusty cat");

        shelter.addPet(pet1);
        shelter.addPet(pet2);
        shelter.addPet(pet3);
        shelter.addPet(pet4);


        while(playGame) {
            System.out.println("Name \t |Hunger \t |Thirst \t |Bladder \t |Boredom \t |Cleanliness \t |Oil");
            System.out.println("------|-----------|-----------|-----------|-----------|---------------|----");
            shelter.petStatus();
            System.out.println();

            System.out.println("What would you like to do next?");
            System.out.println();
            System.out.println("Enter 1 to give food to all of the pets!");
            System.out.println("Enter 2 to give a drink to all of the pets!");
            System.out.println("Enter 3 to select a pet to use the bathroom!");
            System.out.println("Enter 4 to select a pet to play with");
            System.out.println("Enter 5 to select a pet to walk");
            System.out.println("Enter 6 to select an Organic pet to clean");
            System.out.println("Enter 7 to select a Robotic pet to maintain");
            System.out.println("Enter 8 to adopt a pet");
            System.out.println("Enter 9 to admit a new pet");
            System.out.println("Enter 10 to leave");
            System.out.println();

            String userInput = input.nextLine();
            if (userInput.equals("1")) {
                shelter.feedAllPets();
            }
            else if (userInput.equals("2")) {
                shelter.allPetsDrink();
            } else if (userInput.equals("3")) {
                System.out.println("Which pet would you like to take out?");
                System.out.println(shelter.listOfAllOrganicPets());
                petChoice = input.nextLine();
                shelter.takeToBathroom(petChoice);
            } else if (userInput.equals("4")) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(shelter.listOfAllPets());
                petChoice = input.nextLine();
                shelter.playWithPet(petChoice);
            } else if (userInput.equals("5")) {
                System.out.println("Which pet would you like to walk");
                System.out.println(shelter.listOfAllPets());
                petChoice = input.nextLine();
                shelter.takeOnAWalk(petChoice);
            } else if (userInput.equals("6")) {
                System.out.println("Which pet environment would you like to clean?");
                //System.out.println(shelter.listOfAllOrganicPets());
                petChoice = input.nextLine();
                shelter.cleanOrganicPet(petChoice);
            }else if (userInput.equals("7")) {
                System.out.println("Which pet would you like to maintenance?");
                System.out.println(shelter.listOfAllRoboticPets());
                petChoice = input.nextLine();
                shelter.oilRobotPet(petChoice);
            }else if (userInput.equals("8")) {
                System.out.println("Which pet would you like to adopt?");
                System.out.println(shelter.listOfAllPets());
                petChoice = input.nextLine();
                shelter.removePet(petChoice);
                System.out.println("Enjoy your new friend \n");
            } else if (userInput.equals("9")) {
                //code to admit new pet
                System.out.println("Is this an Organic or Robotic pet?");
                String parentType= input.nextLine();
                System.out.println("Cat or Dog?");
                String animalType = input.nextLine();
                System.out.println("What is the pet's name?");
                String newPetName = input.nextLine();
                System.out.println("Describe the pet.");
                String newPetDescription = input.nextLine();

                if(parentType.toLowerCase().charAt(0) ==  'o') {
                    if(animalType.toLowerCase().charAt(0) == 'd') {
                        VirtualPet newPet = new OrganicDog(newPetName, newPetDescription);
                        shelter.addPet(newPet);
                    } else if(animalType.toLowerCase().charAt(0) == 'c') {
                        VirtualPet newPet = new OrganicCat(newPetName, newPetDescription);
                        shelter.addPet(newPet);
                    } else
                        System.out.println("We only take Cats or Dogs!");
                } else if(parentType.toLowerCase().charAt(0) ==  'r'){
                    if(animalType.toLowerCase().charAt(0) == 'd') {
                        VirtualPet newPet = new RoboticDog(newPetName, newPetDescription);
                        shelter.addPet(newPet);
                    } else if(animalType.toLowerCase().charAt(0) == 'c') {
                        VirtualPet newPet = new RoboticCat(newPetName, newPetDescription);
                        shelter.addPet(newPet);
                    } else
                        System.out.println("We only take Cats or Dogs!");
                } else
                    System.out.println("we only take Organic or Robotic pets!");

            } else if (userInput.equals("10")) {
                System.out.println("Thanks for visiting the shelter. See you next time!");
                playGame = false;
            }

        }

    }
}