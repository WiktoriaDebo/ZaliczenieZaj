package ZadProb;

public class Firma{

    public static void main(String args[]){
        Pracownik pracownik1 = new Pracownik();
        Pracownik pracownik2 = new Pracownik();

        pracownik1.imie = "Staszek";
        pracownik1.nazwisko = "Ptaszek";
        pracownik1.wiek = 35;

        pracownik2.imie = "Wlodek";
        pracownik2.nazwisko = "Zieba";
        pracownik2.wiek = 45;

        System.out.println("Pracownicy firmy to:");
        System.out.println(pracownik1.imie+" "+pracownik1.nazwisko+", "+pracownik1.wiek+" lat");
        System.out.println(pracownik2.imie+" "+pracownik2.nazwisko+", "+pracownik2.wiek+" lat");
    }
}