import java.util.Scanner;
public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        //Greet user and instantiate and display myVirtualPet status.
        System.out.println("Welcome to Java Pet");
        System.out.print("What do you want to call your otter? ");
        String petName = input.nextLine();
        VirtualPet myVirtualPet = new VirtualPet(50, 50, 80, petName);
        System.out.println(petName + " The Otter ");
        System.out.println(" .----.__\n" +
                "     / c  ^  _`;\n" +
                "     |     .--'\n" +
                "      \\   (\n" +
                "      /  -.\\\n" +
                "     / .   \\\n" +
                "    /  \\    |\n" +
                "   ;    `-. `.\n" +
                "   |      /`'.`.\n" +
                "   |      |   \\ \\\n" +
                "   |    __|    `'\n" +
                "   ;   /   \\\n" +
                "  ,'        |\n" +
                " (_`'---._ /--,\n" +
                "   `'---._`'---..__\n" +
                "          `''''--, )\n" +
                "            _.-'`,`\n" +
                "             ````");
        System.out.println("Hunger: " + myVirtualPet.getHunger() + "\n" + "Thirst: " + myVirtualPet.getThirst() + "\n"
                + "Waste: " + myVirtualPet.getWaste() + "\n");



        //runs game loop as long as myVirtualPet is alive
        while (!myVirtualPet.getStatus()) {

            //user choices for pet action
            System.out.println("What do you want to do? ");
            System.out.println("1. Feed " + petName);
            System.out.println("2. Give water to " + petName);
            System.out.println("3. Take " + petName + " to bathroom ");
            System.out.print("4. " + petName + " will do nothing ");
            choice = input.nextInt();
            System.out.println("\n");

            if (choice == 1) {
                myVirtualPet.feed();
            } else if (choice == 2) {
                myVirtualPet.drink();
            } else if (choice == 3) {
                myVirtualPet.relieve();
            } else if (choice == 4) {
                myVirtualPet.doNothing();
            } else {
                System.out.println("Invalid response, Please try again");
            }

            //print myVirtualPet status
            System.out.println("Hunger: " + myVirtualPet.getHunger() + "\n" + "Thirst: " + myVirtualPet.getThirst()
                    + "\n" + "Waste: " + myVirtualPet.getWaste());
            System.out.println("\n time passed " + myVirtualPet.getTimePassed());


        }

        //prints when myVirtualPet dies
        System.out.println("\n" + petName + " is dead!");
    }
}