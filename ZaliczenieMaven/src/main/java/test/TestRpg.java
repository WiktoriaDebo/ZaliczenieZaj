package test;

import Characters.Human;
import Fantasy.Dwarf;
import Fantasy.Elf;
import com.google.gson.Gson;

/**
 * W klasie testowej TestRpg jest złożenie wszystkich tych klas w symulator walki rpg.
 * Wyświetlam parę postaci za pomocą obiektu Human.getInstance losuje nam statystyki i imię.
 * Za każdym razem, gdy walka się kończy i zaczyna wyświetla się informacja.
 * Dodatkowo za pomocą zewnętrznego pakietu gson dodanego w pom.xml skonwersowałam obiekty java na ciąg JSON statystyki postaci na koniec gry.
 */
public class TestRpg {
    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println("Time to start the journey!" + "\nYour first fight begins!");
        Human h1 = Human.GetInstance();
        Elf e1 = Elf.getInstance();
        System.out.println(h1);
        System.out.println(e1);
        h1.attack(e1);
        System.out.println("The fight has ended.");

        System.out.println("\nSuddenly new enemy shows up!");
        Dwarf d2 = Dwarf.getInstance();
        System.out.println(h1);
        System.out.println(d2);
        d2.attack(h1);
        System.out.println("The fight has ended.");

        System.out.println("\nAnother fight begins!");
        Elf e2 = Elf.getInstance();
        Dwarf d1 = Dwarf.getInstance();
        System.out.println(e2);
        System.out.println(d1);
        e2.attack(d1);
        System.out.println("The fight has ended.");

        System.out.println("\nStatystyki walk: \n");
        String human1Json = gson.toJson(h1);
        String elf1Json = gson.toJson(e1);
        String dwarf2Json = gson.toJson(d2);
        String elf2Json = gson.toJson(e2);
        String dwarf1Json = gson.toJson(d1);

        System.out.println(human1Json);
        System.out.println(elf1Json);
        System.out.println(dwarf2Json);
        System.out.println(elf2Json);
        System.out.println(dwarf1Json);

    }
}
