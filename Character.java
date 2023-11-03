import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Define the interface for the video game characters
interface Character {
    void attack(Character target);
    void receiveDamage(int damageAmount);
    String getName();
    int getLifePoints();
}

// Implementation of a generic class for video game characters
class GenericCharacter<T> implements Character {
    private String name;
    private int lifePoints;

    public GenericCharacter(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    public void attack(Character target) {
        System.out.println(this.getName() + " attacks " + target.getName());
    }

    public void receiveDamage(int damageAmount) {
        lifePoints -= damageAmount;
        if (lifePoints <= 0) {
            System.out.println(this.getName() + " has been defeated.");
        }
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }
}

// Class that represents a specific character
class Warrior extends GenericCharacter<Character> {
    public Warrior(String name, int lifePoints) {
        super(name, lifePoints);
    }

    public void attack(Character target) {
        System.out.println(this.getName() + " strikes " + target.getName() + " with his sword");
    }
}

// Class that represents another specific type of character
class Wizard extends GenericCharacter<Character> {
    public Wizard(String name, int lifePoints) {
        super(name, lifePoints);
    }

    public void attack(Character target) {
        System.out.println(this.getName() + " casts a spell at " + target.getName());
    }
}
