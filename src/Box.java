import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class Box implements Comparable<Box>{
    double price;
    double size;
    static Random rand = new Random();

    @Override
    public int compareTo(@NotNull Box o) {
        return Double.compare(o.price / o.size,this.price / this.size);
    }

    public Box(double price, double size) {
        this.price = price;
        this.size = size;
    }
    public static Box getInstance(){
        double price = rand.nextDouble(10,50);
        double size = rand.nextDouble(10,100);
        return new Box(price,size);
    }

    @Override
    public String toString() {
        return "Box = (" +
                "price=" + price +
                ", size=" + size +
                ')';
    }

    public static void main(String[] args) {
        Integer[] arrInt = {1,3,4,2,13,4,5,622,-133};
        System.out.println(Arrays.toString(arrInt));
        Arrays.sort(arrInt);
        System.out.println(Arrays.toString(arrInt));

        Box[] boxArr = { new Box(getInstance().price, getInstance().size), new Box(getInstance().price, getInstance().size), new Box(getInstance().price, getInstance().size)};
        System.out.println(Arrays.toString(boxArr));
        Arrays.sort(boxArr);
        System.out.println(Arrays.toString(boxArr));
    }
}