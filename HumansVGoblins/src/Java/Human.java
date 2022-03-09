public class Human extends Combatant {

    public Human() {
        this.health = 5;
        this.strength = 5;
        this.intelligence = 5;
        this.maxHealth = 5;
    }

    //test human constructor
    public Human(Integer location) {
        this.health = 5;
        this.strength = 5;
        this.intelligence = 5;
        this.maxHealth = 5;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Human{" + "health = " + this.health + ", strength = " + this.strength + ", intelligence = " + this.intelligence + ", maxHealth = " + this.maxHealth + "}";
    }

    public void swordSlash(Object object) {
        System.out.println("Human attacks " + object + " using his " + this.getStrength() + " strength.");
    }

}
