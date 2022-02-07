import java.util.Scanner;

public class GuessTheNumber {

    public static void main() {

        // Arrays that contain attempt and attempts left data to create more entertaining dialogue.

        String[] attempt = {"last", "fifth", "fourth", "third", "second", "first"};
        String[] attemptsLeft = {"null", "one", "two", "three", "four", "five"};

        // Scanner initialization and number 1-20 is defined here.

        Scanner userInput = new Scanner(System.in);
        int guessTheNumber = randomNum();

        // Dialogue starts here.

        System.out.println(String.format("What is thy name?%n%n[ENTER YOUR NAME BELOW]%n"));

        String name = userInput.nextLine();

        System.out.println(String.format("%nHark, %s! I am thinking of a number between 1 and 20.%nMake a guess as to what it is.%nYou may only guess six times.%n", name));



        int x = 5; // "x" must be 5 to represent 0-5 in the arrays of data.

        // What a great opportunity for a while loop! :)

        while (x > -1) {

            try {

                int guess = userInput.nextInt();

            /* Winning, unorthodox, and losing conditions must be evaluated first in case the user
            inputs the correct number, a number outside 1-20, or loses. If this is not done first, the losing
            condition would trigger after the guess message, which wouldn't make much sense.

            Example:

            TOO LOW! GUESS AGAIN!
            NEVERMIND, YOU LOSE SCRUB!
             */

                if (guess == guessTheNumber) {
                    System.out.println(winningMessage(attempt[x], name));
                    userInput.close();
                    break;
                } else if (guess < 1 || guess > 20) {
                    System.out.println(notAGuess());
                    userInput.close();
                    break;
                } else if (x == 0) {
                    System.out.println(youLose(name));
                    userInput.close(); //User input must close before the program should close.
                    break; //Must have break statements to exit without throwing errors.
                } else if (guess < guessTheNumber) {
                    System.out.println(tooLow(attemptsLeft[x]));
                } else {
                    System.out.println(tooHigh(attemptsLeft[x]));
                }

                x--;

            } catch (Exception e) {
                System.out.println("That was not a number! *zap*");
                break;
            }
        }
    }

    public static int randomNum() {
        return (int) (1 + Math.random() * 20);

    }

    public static String winningMessage(String attempt, String nameInScanner) {
        return String.format("Forsooth! %s, you have guessed my number on the %s attempt! What luck!", nameInScanner, attempt);
    }

    public static String tooLow(String attemptsLeft) {
        return String.format("Too low. Guess again; you only have %s attempt(s) left.", attemptsLeft);
    }

    public static String tooHigh(String attemptsLeft) {
        return String.format("Too high. Guess again; you only have %s attempt(s) left.", attemptsLeft);
    }

    public static String notAGuess() {
        return String.format("This was not a number we agreed to!%nYou have been sent to the shadow realm.");
    }

    public static String youLose(String name) {
        return String.format("Well, %s. It was nice playing our little game, but you lose.%nYou have now been banished to purgatory!", name);


    }

}
