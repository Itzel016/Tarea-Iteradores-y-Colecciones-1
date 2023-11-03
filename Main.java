import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
     public static void main(String[] args) {
         List<Character> characters = new ArrayList<>();
        
         // Add characters to the collection
         characters.add(new Warrior("Conan", 100));
         characters.add(new Wizard("Gandalf", 80));
         characters.add(new Warrior("Aragorn", 120));

         // Use an iterator to loop and operate on the characters
         Iterator<Character> iterator = characters.iterator();
         while (iterator.hasNext()) {
             Character character = iterator.next();
             character.attack(characters.get(0)); // Everyone attacks the first character in the collection
             character.receiveDamage(20);
         }
     }
}

