import java.util.*;

public class HangmanProgram {

    public static void main(String[] args) {

        //create scanner
        Scanner scan = new Scanner(System.in);
        //create a parent while loop that encompasses all operational code of the game so user can replay
        while (true) {
            //generate random word from external array
            String randomWord = HangmanObjects.getRandomWord();
            //generate hashmap to store winning letters
            HashMap<Integer, String> letters = HangmanObjects.populateWithLetters(randomWord);
            //generate ArrayList with possible letters
            ArrayList<String> possibleLetters = HangmanObjects.getPossibleLetters();
            //generate ArrayList with hangman body parts
            ArrayList<String> hangmanBodyParts = HangmanObjects.getHangmanBodyParts();
            //create new string from randomWord characters to use underscores
            ArrayList<String> underscoresArray = HangmanObjects.getUnderscoresArray(randomWord);
            String underscores = HangmanObjects.getUnderscoresString(underscoresArray, randomWord);

            //start dialogue
            System.out.println("H A N G M A N");

            //enter variables for while loop
            int deathCounter = 0;
            String missedLetters = "";

            try {
                while (deathCounter < 7) {
                    underscores = HangmanObjects.getUnderscoresString(underscoresArray, randomWord);
                    System.out.println(hangmanBodyParts.get(deathCounter));
                    if (deathCounter == 6) {
                        System.out.println("You lose!");
                        break;
                    }

                    if (underscores.equals(randomWord)) {
                        System.out.println(randomWord);
                        System.out.println("You win!");
                        break;
                    }

                    System.out.println("Missed letters: " + missedLetters);
                    System.out.println(underscores);
                    System.out.println("Guess a letter! (lowercase please)");
                    String guess = scan.nextLine();

                    if (!possibleLetters.contains(guess)) {
                        System.out.println("You must enter a letter! Closing...");
                        break;
                    }

                    if (letters.containsValue(guess)) {
                        for (int i = 0; i < randomWord.length(); i++) {
                            if (randomWord.charAt(i) == guess.charAt(0)) {
                                underscoresArray.set(i, guess);
                            }
                        }
                    }

                    if (!letters.containsValue(guess)) {
                        missedLetters += guess;
                        deathCounter++;
                    }
                }

                System.out.println("Would you like to play again? (yes or no)");
                String answer = scan.nextLine();
                if (answer.equals("no")) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Well folks, an error happened. Launch again.");
            }
        }
    }
}
