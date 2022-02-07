//Scanner must be imported in order to create a scanner variable.
import java.util.Scanner;

public class DragonCave {

    public static void main(String[] args) {
        Scanner decision = new Scanner(System.in);
        //System.in takes user input inside the console.

        System.out.println(welcomeMessage());
        //String.format must be used to we can make new lines ( %n ) so the console looks cleaner.
        try {
            int a = decision.nextInt();

            switch (a) {
                case 1:
                    System.out.println(badCave());
                    break;
                case 2:
                    System.out.println(goodCave());
                    break;
                default:
                    System.out.println(notAnOption());
                /*It is good to use switch case here because the default statement can be easily used to
                define a default return if any other number than 1 or 2 is submitted as a user input.
                 */
            }

        } catch (Exception e) {
            System.out.println(errorMessage());
        }
        // The scanner variable must use the .close() method because this is the end of the user input.
        decision.close();
    }

    public static String welcomeMessage() {
        return String.format("You are in a land full of dragons. In front of you,%nyou see two caves. In one cave, the dragon is friendly%nand will share his treasure with you. The other dragon%nis greedy and hungry and will eat you on sight.%nWhich cave will you go into? (1 or 2)%n%n%n");
    }

    public static String notAnOption() {
        return String.format("There is only cave 1 or 2!%nYou fell off a cliff!");
    }

    public static String goodCave() {
        return String.format("You are in a cave...%nIt is surprisingly quite pleasant!%nYou step over the welcome mat to see a dragon sitting on a stache of coins smoking a hookah.%nHe tosses you a coin with a friendly smile.%nYou wonder why a dragon so rich would be so generous.");
    }

    public static String badCave() {
        return String.format("You are in a cave...%nIt is dark and spooky...%nA large dragon jumps out in front of you!%nHe opens his jaws and...%nGobbles you down in one bite!");
    }

    public static String errorMessage() {
        return String.format("That was definitely not an option!%nClosing. . . ");
    }

}
