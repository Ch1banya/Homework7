package Homework6;


public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.Run = random.nextInt(45) + 120;
        this.type = "Cat";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Котики не любят воду.");
    }
}
