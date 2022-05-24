package Homework6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.Run = random.nextInt(300) + 200;
        this.Swim = random.nextInt(6) + 5;
    }
}
