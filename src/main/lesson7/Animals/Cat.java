package main.lesson7.Animals;


public class Cat extends Animal implements MilkEating {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void milkEating() {
        System.out.println("MilkEating animal");
    }
}
