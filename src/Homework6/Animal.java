package Homework6;

import java.util.Random;

public class Animal {
    protected String name;
    protected String type;
    protected int Run;
    protected int Swim;
    public Random random = new Random();

    public Animal(String name) {
        this.name = name;
    }
    public void run(int dist) {
        if (this.Run >= dist) System.out.println(this.type + " " + this.name + " бежит " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " не бежит так далеко.");
    }

    public void swim(int dist) {
        if (this.Swim >= dist) System.out.println(this.type + " " + this.name + " плывет " + dist + " м.");
        else System.out.println(this.type + " " + this.name + " не плывет так далеко.");
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " бежит: " + this.Run + " м., плывет: " + this.Swim);
    }
}