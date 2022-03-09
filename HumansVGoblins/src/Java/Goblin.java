public class Goblin extends Combatant{

    public Goblin(Integer location) {
        this.health = 5;
        this.strength = 6;
        this.intelligence = 4;
        this.maxHealth = 5;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Goblin{" + "health = " + this.health + ", strength = " + this.strength + ", intelligence = " + this.intelligence + ", maxHealth = " + this.maxHealth + "}";
    }

    public void slashAttack(Human human) {
        System.out.println("Goblin attempts to attack ");
    }
}
