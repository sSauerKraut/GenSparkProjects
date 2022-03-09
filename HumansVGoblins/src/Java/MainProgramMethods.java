import com.sun.tools.javac.Main;

import java.lang.management.ManagementFactory;
import java.util.*;

public class MainProgramMethods {

    //THIS PRINTS THE WELCOME MESSAGE FOR THE START OF THE PROGRAM
    public static String welcomeMessage() {
        return String.format(
                "----%n----%nWelcome to Humans vs. Goblins!%n" +
                "In this world:%n" +
                "Goblins deal slightly more damage than Humans. (Strength)%n" +
                "However, Humans take slightly less damage than Goblins. (Intelligence)%n%n"
        );
    }

    //COLUMNS ARRAYLIST FOR MOVEMENT METHODS AND MAP GENERATION, ETC:
    public static ArrayList<Integer> columns() {
        ArrayList<Integer> columns = new ArrayList<>();
        columns.add(100);
        columns.add(200);
        columns.add(300);
        columns.add(400);
        columns.add(500);
        columns.add(600);
        columns.add(700);
        columns.add(800);
        columns.add(900);
        columns.add(1000);
        return columns;
    }

    //THIS CREATES THE HASHMAP FOR THE LAND OBJECTS, DECLARE ONLY ONCE
    public static HashMap<Integer, Land> setLandMap(ArrayList<Integer> columns) {
        HashMap<Integer, Land> map = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            Integer numberOfLand;
            for (Integer number : columns) {
                numberOfLand = number + i;
                map.put(numberOfLand, new Land(numberOfLand));
            }
        }
        map.get(101).setOwner('H');
        map.get(1010).setOwner('G');

        return map;
    }

    //THIS PRINTS THE LAND MAP IN A SPECIFIC ORDER, IT WILL BE CALLED MULTIPLE TIMES IN THE PROGRAM
    public static String printLandMap(HashMap<Integer, Land> map) {
        return String.format (
                "--------100--200--300--400--500--600--700--800--900--1000--%n" +
                "----1----" + map.get(101).getOwner() + "----" + map.get(201).getOwner() + "----" + map.get(301).getOwner() + "----" + map.get(401).getOwner() + "----" + map.get(501).getOwner() + "----" + map.get(601).getOwner() + "----" + map.get(701).getOwner() + "----" + map.get(801).getOwner() + "----" + map.get(901).getOwner() + "----" + map.get(1001).getOwner() + "----%n" +
                "----2----" + map.get(102).getOwner() + "----" + map.get(202).getOwner() + "----" + map.get(302).getOwner() + "----" + map.get(402).getOwner() + "----" + map.get(502).getOwner() + "----" + map.get(602).getOwner() + "----" + map.get(702).getOwner() + "----" + map.get(802).getOwner() + "----" + map.get(902).getOwner() + "----" + map.get(1002).getOwner() + "----%n" +
                "----3----" + map.get(103).getOwner() + "----" + map.get(203).getOwner() + "----" + map.get(303).getOwner() + "----" + map.get(403).getOwner() + "----" + map.get(503).getOwner() + "----" + map.get(603).getOwner() + "----" + map.get(703).getOwner() + "----" + map.get(803).getOwner() + "----" + map.get(903).getOwner() + "----" + map.get(1003).getOwner() + "----%n" +
                "----4----" + map.get(104).getOwner() + "----" + map.get(204).getOwner() + "----" + map.get(304).getOwner() + "----" + map.get(404).getOwner() + "----" + map.get(504).getOwner() + "----" + map.get(604).getOwner() + "----" + map.get(704).getOwner() + "----" + map.get(804).getOwner() + "----" + map.get(904).getOwner() + "----" + map.get(1004).getOwner() + "----%n" +
                "----5----" + map.get(105).getOwner() + "----" + map.get(205).getOwner() + "----" + map.get(305).getOwner() + "----" + map.get(405).getOwner() + "----" + map.get(505).getOwner() + "----" + map.get(605).getOwner() + "----" + map.get(705).getOwner() + "----" + map.get(805).getOwner() + "----" + map.get(905).getOwner() + "----" + map.get(1005).getOwner() + "----%n" +
                "----6----" + map.get(106).getOwner() + "----" + map.get(206).getOwner() + "----" + map.get(306).getOwner() + "----" + map.get(406).getOwner() + "----" + map.get(506).getOwner() + "----" + map.get(606).getOwner() + "----" + map.get(706).getOwner() + "----" + map.get(806).getOwner() + "----" + map.get(906).getOwner() + "----" + map.get(1006).getOwner() + "----%n" +
                "----7----" + map.get(107).getOwner() + "----" + map.get(207).getOwner() + "----" + map.get(307).getOwner() + "----" + map.get(407).getOwner() + "----" + map.get(507).getOwner() + "----" + map.get(607).getOwner() + "----" + map.get(707).getOwner() + "----" + map.get(807).getOwner() + "----" + map.get(907).getOwner() + "----" + map.get(1007).getOwner() + "----%n" +
                "----8----" + map.get(108).getOwner() + "----" + map.get(208).getOwner() + "----" + map.get(308).getOwner() + "----" + map.get(408).getOwner() + "----" + map.get(508).getOwner() + "----" + map.get(608).getOwner() + "----" + map.get(708).getOwner() + "----" + map.get(808).getOwner() + "----" + map.get(908).getOwner() + "----" + map.get(1008).getOwner() + "----%n" +
                "----9----" + map.get(109).getOwner() + "----" + map.get(209).getOwner() + "----" + map.get(309).getOwner() + "----" + map.get(409).getOwner() + "----" + map.get(509).getOwner() + "----" + map.get(609).getOwner() + "----" + map.get(709).getOwner() + "----" + map.get(809).getOwner() + "----" + map.get(909).getOwner() + "----" + map.get(1009).getOwner() + "----%n" +
                "----10---" + map.get(110).getOwner() + "----" + map.get(210).getOwner() + "----" + map.get(310).getOwner() + "----" + map.get(410).getOwner() + "----" + map.get(510).getOwner() + "----" + map.get(610).getOwner() + "----" + map.get(710).getOwner() + "----" + map.get(810).getOwner() + "----" + map.get(910).getOwner() + "----" + map.get(1010).getOwner() + "----%n" +
                "[KEY]%nU = Unoccupied land%n+ = Human land; H = Human currently on this land%n* = Goblin land; G = Goblin currently on this land%n%n"
        );
    }

    //A SPAWN LOCATION MUST BE SET

    //MOVEMENT METHODS
    public static void moveDecision(HashMap<Integer, Land> map, ArrayList<Human> humanSoldiers, Scanner scanner) {
        int moveCounter = 1;

        while (moveCounter < humanSoldiers.size() + 1) {
            Combatant combatant = humanSoldiers.get(moveCounter - 1);
            System.out.println("Move Solder #" + moveCounter + " currently at location: " + humanSoldiers.get(moveCounter - 1).getLocation());
            String decision = "";
            boolean isADirection = false;
            while (!isADirection) {
                decision = scanner.nextLine().toLowerCase(Locale.ROOT);
                if (decision.equals("north") || decision.equals("south") || decision.equals("east") || decision.equals("west")) {
                    isADirection = true;
                } else {
                    System.out.println("Not a direction. You must enter 'north', 'south', 'east', or 'west'");
                }
            }
            switch (decision) {
                case "east":
                    MainProgramMethods.moveEast(combatant, map);
                    System.out.println(MainProgramMethods.printLandMap(map));
                    break;
                case "south":
                    MainProgramMethods.moveSouth(combatant, map);
                    System.out.println(MainProgramMethods.printLandMap(map));
                    break;
                case "north":
                    MainProgramMethods.moveNorth(combatant, map);
                    System.out.println(MainProgramMethods.printLandMap(map));
                    break;
                case "west":
                    MainProgramMethods.moveWest(combatant, map);
                    System.out.println(MainProgramMethods.printLandMap(map));
                    break;
            }
            moveCounter++;
        }
        System.out.println("You moved all of your soldiers.");
    }

    public static void goblinMoveDecision(ArrayList<Goblin> goblinSoldiers, HashMap<Integer, Land> map, ArrayList<Human> humanSoldiers) {
        int moveCounter = 0;

        while (moveCounter < goblinSoldiers.size()) {
            Combatant combatant = goblinSoldiers.get(moveCounter);
            boolean hasMadeTurn = false;
            Random rand = new Random();
            int n = rand.nextInt(2);
            //northwesterly movement
            if (combatant.getLocation() - humanSoldiers.get(moveCounter).getLocation() > 90 &&
            combatant.getLocation() % 100 > humanSoldiers.get(moveCounter).getLocation() % 100 &&
            !hasMadeTurn) {
                switch (n) {
                    case 0:
                        MainProgramMethods.moveWest(combatant, map);
                        break;
                    case 1:
                        MainProgramMethods.moveNorth(combatant, map);
                        break;
                }
                hasMadeTurn = true;
            }
            //northeasterly movement
            if (combatant.getLocation() - humanSoldiers.get(moveCounter).getLocation() < -90 &&
            combatant.getLocation() % 100 > humanSoldiers.get(moveCounter).getLocation() % 100 &&
            !hasMadeTurn) {
                switch (n) {
                    case 0:
                        MainProgramMethods.moveEast(combatant, map);
                        break;
                    case 1:
                        MainProgramMethods.moveNorth(combatant, map);
                        break;
                }
                hasMadeTurn = true;
            }
            //southeasterly movement
            if (combatant.getLocation() - humanSoldiers.get(moveCounter).getLocation() < -90 &&
            combatant.getLocation() % 100 < humanSoldiers.get(moveCounter).getLocation() % 100 &&
            !hasMadeTurn) {
                switch (n) {
                    case 0:
                        MainProgramMethods.moveEast(combatant, map);
                        break;
                    case 1:
                        MainProgramMethods.moveSouth(combatant, map);
                        break;
                }
                hasMadeTurn = true;
            }
            //southwesterly movement
            if (combatant.getLocation() - humanSoldiers.get(moveCounter).getLocation() > 90 &&
            combatant.getLocation() % 100 < humanSoldiers.get(moveCounter).getLocation() % 100 &&
            !hasMadeTurn) {
                switch (n) {
                    case 0:
                        MainProgramMethods.moveWest(combatant, map);
                        break;
                    case 1:
                        MainProgramMethods.moveSouth(combatant, map);
                        break;
                }
                hasMadeTurn = true;
            }
            //move north only
            if (combatant.getLocation() % 100 > humanSoldiers.get(moveCounter).getLocation() % 100 && !hasMadeTurn) {
                MainProgramMethods.moveNorth(combatant, map);
                hasMadeTurn = true;
            }
            //move south only
            if (combatant.getLocation() % 100 < humanSoldiers.get(moveCounter).getLocation() % 100 && !hasMadeTurn) {
                MainProgramMethods.moveSouth(combatant, map);
                hasMadeTurn = true;
            }
            //move east only
            if (combatant.getLocation() - humanSoldiers.get(moveCounter).getLocation() < -90 && !hasMadeTurn) {
                MainProgramMethods.moveEast(combatant, map);
                hasMadeTurn = true;
            }
            //move west only
            if (combatant.getLocation() - humanSoldiers.get(moveCounter).getLocation() > 90 && !hasMadeTurn) {
                MainProgramMethods.moveWest(combatant, map);
                hasMadeTurn = true;
            }
            moveCounter++;
        }
    }

    public static void moveNorth(Combatant combatant, HashMap<Integer, Land> map) {
        if (map.containsKey(combatant.getLocation() - 1)) {
            combatant.setLocation(combatant.getLocation() - 1);
            if (combatant.getClass() == Human.class) {
                map.get(combatant.getLocation()).setOwner('H');
                map.get(combatant.getLocation() + 1).setOwner('+');
            }
            if (combatant.getClass() == Goblin.class) {
                map.get(combatant.getLocation()).setOwner('G');
                map.get(combatant.getLocation() + 1).setOwner('*');
            }
        } else {
            System.out.println("Invalid move.");
        }

    }

    public static void moveSouth(Combatant combatant, HashMap<Integer, Land> map) {
        if (map.containsKey(combatant.getLocation() + 1)) {
            combatant.setLocation(combatant.getLocation() + 1);
            if (combatant.getClass() == Human.class) {
                map.get(combatant.getLocation()).setOwner('H');
                map.get(combatant.getLocation() - 1).setOwner('+');
            }
            if (combatant.getClass() == Goblin.class) {
                map.get(combatant.getLocation()).setOwner('G');
                map.get(combatant.getLocation() - 1).setOwner('*');
            }
        } else {
            System.out.println("Invalid move.");
        }
    }

    public static void moveWest(Combatant combatant, HashMap<Integer, Land> map) {
        if (map.containsKey(combatant.getLocation() - 100)) {
            combatant.setLocation(combatant.getLocation() - 100);
            if (combatant.getClass() == Human.class) {
                map.get(combatant.getLocation()).setOwner('H');
                map.get(combatant.getLocation() + 100).setOwner('+');
            }
            if (combatant.getClass() == Goblin.class) {
                map.get(combatant.getLocation()).setOwner('G');
                map.get(combatant.getLocation() + 100).setOwner('*');
            }
        } else {
            System.out.println("Invalid move.");
        }
    }

    public static void moveEast(Combatant combatant, HashMap<Integer, Land> map) {
        if (map.containsKey(combatant.getLocation() + 100)) {
            combatant.setLocation(combatant.getLocation() + 100);
            if (combatant.getClass() == Human.class) {
                map.get(combatant.getLocation()).setOwner('H');
                map.get(combatant.getLocation() - 100).setOwner('+');
            }
            if (combatant.getClass() == Goblin.class) {
                map.get(combatant.getLocation()).setOwner('G');
                map.get(combatant.getLocation() - 100).setOwner('*');
            }
            System.out.println();
        } else {
            System.out.println("Invalid move.");
        }
    }

    //LAND OWNERSHIP COUNTER... USED AFTER EVERY TURN
    public static void landOwnerCounter(HashMap<Integer, Land> map, HumanTeam humanteam, GoblinTeam goblinteam) {
        int humanLandCounter = 0;
        int goblinLandCounter = 0;
        for (Land value : map.values()) {
            if (value.getOwner() == 'H' || value.getOwner() == '+') {
                humanLandCounter++;
            }
            if (value.getOwner() == 'G' || value.getOwner() == '*') {
                goblinLandCounter++;
            }
        }
        humanteam.setLandCount(humanLandCounter);
        goblinteam.setLandCount(goblinLandCounter);

        System.out.println("Human Team has " + humanteam.getLandCount() + " lands.");
        System.out.println("Goblin Team has " + goblinteam.getLandCount() + " lands.");
    }

    //BATTLES
    public static void isItBattleTime(boolean whosTurnIsIt, ArrayList<Goblin> goblinSoldiers, ArrayList<Human> humanSoldiers) {

        for (var humanSoldier : humanSoldiers) {

        }
    }



}
