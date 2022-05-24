package Homework6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Kitty");
        Cat cat2 = new Cat("Lulu");

        Dog dog1 = new Dog("Steve");
        Dog dog2 = new Dog("Daisy");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(400);
        dog1.swim(7);

        System.out.println();

        cat1.run(200);
        cat1.swim(3);
    }
}
