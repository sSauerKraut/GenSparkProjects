import com.sun.tools.javac.Main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        //start scanner
        Scanner userInput = new Scanner(System.in);

        //create teams
        HumanTeam humanTeam = new HumanTeam();
        GoblinTeam goblinTeam = new GoblinTeam();

        //create soldiers arraylists
        ArrayList<Human> humanSoldiers = new ArrayList<>();
        Human human = new Human(101);
        humanSoldiers.add(human);

        ArrayList<Goblin> goblinSoldiers = new ArrayList<>();
        Goblin goblin = new Goblin(1010);
        goblinSoldiers.add(goblin);

        //create map
        HashMap<Integer, Land> mainMap = MainProgramMethods.setLandMap(MainProgramMethods.columns());

        //start dialogue
        System.out.println(MainProgramMethods.welcomeMessage());

        while (humanTeam.getLandCount() < 100 || goblinTeam.getLandCount() < 100) {
            //print map
            System.out.print(MainProgramMethods.printLandMap(mainMap));
            //humans turn
            boolean humansTurn = true;
            MainProgramMethods.moveDecision(mainMap, humanSoldiers, userInput);
            //goblins make a move decision
            humansTurn = false;
            MainProgramMethods.goblinMoveDecision(goblinSoldiers, mainMap, humanSoldiers);
            //count the lands that are owned by humans and goblins after moves are made
            MainProgramMethods.landOwnerCounter(mainMap, humanTeam, goblinTeam);
        }
    }
}
