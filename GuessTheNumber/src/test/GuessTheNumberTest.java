import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessTheNumberTest {

    @Test
    void tooLow() {
        assertEquals(String.format("Too low. Guess again; you only have %s attempt(s) left.", "four"), GuessTheNumber.tooLow("four"));
    }

    @Test
    void winningMessage() {
        assertEquals(String.format("Forsooth! %s, you have guessed my number on the %s attempt! What luck!", "Keegan", "fifth"), GuessTheNumber.winningMessage("fifth", "Keegan"));
    }

    @Test
    void tooHigh() {
        assertEquals(String.format("Too high. Guess again; you only have %s attempt(s) left.", "five"), GuessTheNumber.tooHigh("five"));
    }

    @Test
    void youLose() {
        assertEquals(String.format("Well, %s. It was nice playing our little game, but you lose.%nYou have now been banished to purgatory!", "Keegan"), GuessTheNumber.youLose("Keegan"));
    }

    @Test
    void notAGuess() {
        assertEquals(String.format("This was not a number we agreed to!%nYou have been sent to the shadow realm."), GuessTheNumber.notAGuess());
    }

    @Test
    void randomNum() {
        GuessTheNumber.randomNum();
    }

    @AfterEach
    void tearDown() {
    }
}