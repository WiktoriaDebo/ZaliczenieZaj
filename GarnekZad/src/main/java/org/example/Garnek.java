package org.example;

public class Garnek {
    String color;
    int howMany;
    String whose;

    public Garnek(String color, int howMany, String whose) {
        this.color = color;
        this.howMany = howMany;
        this.whose = whose;
    }

    @Override
    public String toString() {
        return "Garnki: \n" +
                "color: " + color + " \n" +
                "how many: " + howMany +
                " \nwhose: " + whose ;
    }
}
