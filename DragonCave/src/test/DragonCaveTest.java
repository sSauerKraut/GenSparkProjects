import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DragonCaveTest {

    @Test
    void errorMessage() {
        assertEquals(String.format("That was definitely not an option!%nClosing. . . "), DragonCave.errorMessage());
    }

    @Test
    void welcomeMessage() {
        assertEquals(String.format("You are in a land full of dragons. In front of you,%nyou see two caves. In one cave, the dragon is friendly%nand will share his treasure with you. The other dragon%nis greedy and hungry and will eat you on sight.%nWhich cave will you go into? (1 or 2)%n%n%n"), DragonCave.welcomeMessage());
    }

    @Test
    void notAnOption() {
        assertEquals(String.format("There is only cave 1 or 2!%nYou fell off a cliff!"), DragonCave.notAnOption());
    }

    @Test
    void goodCave() {
        assertEquals(String.format("You are in a cave...%nIt is surprisingly quite pleasant!%nYou step over the welcome mat to see a dragon sitting on a stache of coins smoking a hookah.%nHe tosses you a coin with a friendly smile.%nYou wonder why a dragon so rich would be so generous."), DragonCave.goodCave());
    }

    @Test
    void badCave() {
        assertEquals(String.format("You are in a cave...%nIt is dark and spooky...%nA large dragon jumps out in front of you!%nHe opens his jaws and...%nGobbles you down in one bite!"), DragonCave.badCave());
    }

    @AfterEach
    void tearDown() {
    }
}