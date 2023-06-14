package Characters;

/**
 * W klasie potomnej Human tworzymy instancje klasy. Dodajemy tablicę postaci, które będą losowane.
 * W GetInstance losujemy ilość życia i siłę postaci.
 * W attack tworzymy jak walka się ma potoczy. ToString pokazuje jak wyglądają statyki postaci na początku walki.
 */
public class Human extends Hero{
    private static String[] names = {"Aragorn", "Bernhardt", "Klaas", "Blackmore", "Sandman"};
    public Human(String name, int health, int strength) {
        super(name, health, strength);
    }
    public static Human GetInstance(){
        String name = names[r.nextInt(names.length)];
        int health = 50+r.nextInt(101);
        int strength= 20+r.nextInt(21) ;
        return new Human (name,health, strength);
    };
    @Override
    public void attack(Hero other) {
        int damage = (int) (this.getStrength() * r.nextDouble());
        other.health -= damage;
        System.out.println( this.getName() + " attacks " + other.getName() + " inflicts " + damage + " damage.");
        this.fight(other);
    }
    @Override
    public String toString() {
        return "Human [" + "name: " + getName() + " | health: " + getHealth()+ " | strength: "+ getStrength() + ']';
    }
}