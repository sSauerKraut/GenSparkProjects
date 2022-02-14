
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class HangmanObjectsTest {

    HangmanObjects hangmanObjects;

    @BeforeEach
    void setUp() {
        hangmanObjects = new HangmanObjects();
    }

    @Test
    void populateWithLetters() {
        HashMap<Integer, String> hashy = hangmanObjects.populateWithLetters("word");
        assertEquals("o", hashy.get(1));
    }

    @Test
    void getRandomWord() {
        //I was told testing random numbers was not fun, let me know what you think.
    }

    @Test
    void makeUnderscores() {
        assertEquals("____", hangmanObjects.makeUnderscores("word"));
    }

    @Test
    void getHangmanBodyParts() {
        ArrayList<String> hangmanBodyParts = hangmanObjects.getHangmanBodyParts();
        assertEquals(String.format(" +---+%n 0   |%n |   |%n/ |  |%n    ==="), hangmanBodyParts.get(4));
    }

    @Test
    void getUnderscoresArray() {
        ArrayList<String> underscoresArr = hangmanObjects.getUnderscoresArray("word word");
        assertEquals(" ", underscoresArr.get(4));
    }

    @Test
    void getUnderscoresString() {
        ArrayList<String> underscoresArr = hangmanObjects.getUnderscoresArray("word");
        String underscoresString = hangmanObjects.getUnderscoresString(underscoresArr, "word");
        assertEquals("_", String.valueOf(underscoresString.charAt(2)));

    }

    @Test
    void getPossibleLetters() {
        ArrayList<String> possibleLetters = hangmanObjects.getPossibleLetters();
        assertEquals("z", possibleLetters.get(possibleLetters.size() - 1));
    }

    @AfterEach
    void tearDown() {
    }
}