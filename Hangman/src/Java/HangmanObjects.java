import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.HashMap;

public class HangmanObjects {

    static String[] words = {"round table", "elephant", "darth vader did nothing wrong", "java is awesome",
                    "flower shirts show your true power"};

    public static HashMap<Integer, String> populateWithLetters(String word) {
        HashMap<Integer, String> letters = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            String toString = "";
            if (word.charAt(i) != ' ') {
                toString += word.charAt(i);
                letters.put(i, toString);
            }
        }
        return letters;
    }

    public static String getRandomWord() {
        Random rand = new Random();
        int n = rand.nextInt(words.length);
        return words[n];
    }

    public static String makeUnderscores(String word) {
        String underscores = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ' ') {
                underscores += ' ';
            } else {
                underscores += '_';
            }
        }
        return underscores;
    }

    public static ArrayList<String> getHangmanBodyParts() {
        return new ArrayList<>(Arrays.asList(gallows, head, body, leftLeg, rightLeg,
                leftArm, rightArm));
    }

    public static ArrayList<String> getUnderscoresArray(String word) {
        ArrayList<String> underscoresArray = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                underscoresArray.add(" ");
            }
            if (word.charAt(i) != ' ') {
                underscoresArray.add("_");
            }
        }
        return underscoresArray;
    }

    public static String getUnderscoresString(ArrayList<String> arr, String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += arr.get(i);
        }
        return result;
    }

    public static ArrayList<String> getPossibleLetters() {
        return new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
                "s","t","u","v","w","x","y","z"));
    }
    //arraylist for the iterations of the hangman's head, body, legs, and arms

    static String gallows = String.format(" +---+%n     |%n     |%n     |%n    ===");
    static String head = String.format(" +---+%n 0   |%n     |%n     |%n    ===");
    static String body = String.format(" +---+%n 0   |%n |   |%n     |%n    ===");
    static String leftLeg = String.format(" +---+%n 0   |%n |   |%n/    |%n    ===");
    static String rightLeg = String.format(" +---+%n 0   |%n |   |%n/ |  |%n    ===");
    static String leftArm = String.format(" +---+%n 0   |%n/|   |%n/ |  |%n    ===");
    static String rightArm = String.format(" +---+%n 0   |%n/||  |%n/ |  |%n    ===");



}
