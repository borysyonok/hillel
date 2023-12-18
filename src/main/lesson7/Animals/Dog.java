package main.lesson7.Animals;

class Dog extends Animal implements MilkEating {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping");
    }
    @Override
    public void milkEating() {
        System.out.println("MilkEating animal");
    }
}
