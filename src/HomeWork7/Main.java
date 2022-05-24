package HomeWork7;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] Cats = new Cat[5];
        Cats[0] = new Cat("Мурзик", 10, false);
        Cats[1] = new Cat("Том",15, false);
        Cats[2] = new Cat("Рыжик", 20, false);
        Cats[3] = new Cat("Пушок",35, false);
        Cats[4] = new Cat("Васька",25, false);


        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < Cats.length; i++) {
            if (Cats[i].satiety == false && Cats[i].appetite < plate.food){
                Cats[i].eat(plate);
                Cats[i].satiety = true;
                System.out.println("Кот по имени " + Cats[i].name + " поел.");
            } else {
                System.out.println("Кот по имени " + Cats[i].name + " не поел.");
            }
        }
        plate.info();
        System.out.println("Введите кол-во корма, которое стоит добавить в тарелку: ");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}

