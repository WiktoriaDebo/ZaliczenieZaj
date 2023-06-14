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

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getHowMany() {
        return howMany;
    }
    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }
    public String getWhose() {
        return whose;
    }
    public void setWhose(String whose) {
        this.whose = whose;
    }

    @Override
    public String toString() {
        return "Garnki: \n" +
                "color = " + color + " \n" +
                "howMany = " + howMany +
                " \nwhose = " + whose ;
    }
}
