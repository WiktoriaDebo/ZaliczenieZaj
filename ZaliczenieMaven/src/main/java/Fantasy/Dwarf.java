package Fantasy;

import Characters.Hero;

/**
 * Klasa potomna Dwarf dodaje nowy gatunek postaci tym razem z gatunku Fantasy.
 * Tak jak w innych potomnych stworzyłam tablice imion oraz dodałam dziedziczenie konstruktorów, getInstance jak i attack.
 */
public class Dwarf extends Hero {
    private static final String[] dwarfNames = {"Thorin", "Gimli", "Fokhorlim","Bumrur Underbeard","Snagrom"};
    public Dwarf(String name, int health, int strength) {
        super(name, health, strength);
    }
    public static Dwarf getInstance(){
        String imie = dwarfNames[r.nextInt(dwarfNames.length)];
        int zdrowie = 50 + r.nextInt(101);
        int sila = 20 + r.nextInt(41);
        return new Dwarf(imie, zdrowie, sila);
    }

    @Override
    public void attack(Hero another) {
        int damage = (int)(this.strength * r.nextDouble(0.5,1));
        another.health -= damage;
        System.out.println( this.name + " attacks " + another.name +
                " and makes " +damage+ " points of damage.");
        this.fight(another);
    }
}
