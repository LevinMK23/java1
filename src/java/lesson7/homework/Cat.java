package lesson7.homework;

import java.util.Random;

public class Cat {

    private int limit;
    private static int counter = 0;
    private final static Random rnd = new Random();

    public Cat() {
        limit = 10 + rnd.nextInt(30);
        counter++;
    }

    public void eat(Plate plate) {
        plate.feed(limit);
        System.out.println("Cat " + counter + " was eat "
         + limit + " bits of food, in plate: " + plate.getFoodCount() + " bits of food");
    }

}
