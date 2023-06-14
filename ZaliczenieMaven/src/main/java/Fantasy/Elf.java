package Fantasy;

import Characters.Hero;

/**
 * Tak samo jak w innych potomnych dodałam tablicę imion, dziedziczony konstruktor oraz getInstance, które losuje statystyki jak i imie postaci.
 *Void attack każe postaci walczyć aż przeciwnik zostanie pokonany jest to dziedziczenie z klasy Hero.
 */
public class Elf extends Hero {
    private static String[] elfNames = {"Erro", "Legolas", "Alfsol", "Kaldia","Yesanith","Leilatha", "Iarrie"};
    public Elf(String name, int health, int strength) {
        super(name, health, strength);
    }
    public static Elf getInstance(){
        String imie = elfNames[r.nextInt(elfNames.length)];
        int zdrowie = 50 + r.nextInt(101);
        int sila = 20 + r.nextInt(41);
        return new Elf(imie, zdrowie, sila);
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