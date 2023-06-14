package Characters;

import java.util.Random;

/**
 * Projekt jest grą rpg polegającą na symulacji walk.
 * W klasie abstrakcyjnej Hero stworzone są postacie ogólne, która następnie będzie dziedziczona poprzez 3 rasy: człowiek, elf i krasnolud.
 * Dodane zostały imię postaci, ilość zdrowia i siła, czyli podstawowe statystyki postaci w konstruktorze geterach i setterach, które zostaną dziedziczone przez klasy potomne.
 * W toString zostało zapisane jak będą się wyświetlać początkowe statystyki postaci w klasie testowej.
 * Następnie tworzony jest warunek aby walka trwała do czasu aż dana postać straci życie.
 *
 */
public abstract class Hero {
    public String name;
    public int health;
    protected int strength;
    protected static Random r = new Random();

    public Hero(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getStrength() {
        return strength;
    }
    public abstract void attack(Hero other);
    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" + "name: " + name  + " | health: " + health + " | strength: " + strength + ']';
    }
    public boolean isAlive(){
        return health > 0;
    }
    protected Hero fight(Hero enemy) {
        while (this.isAlive() && enemy.isAlive()) {
            this.attack(enemy);
            if (enemy.isAlive()) enemy.attack(this);
        }
        if (isAlive()) {
            //System.out.println(enemy.getName() + " is defeated.");
            return this;
        } else {
            //System.out.println(getName() + " is defeated.");
            return enemy;
        }

    }
}
