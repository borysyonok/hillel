package main.lesson7;

public class Car {
    private String engine;
    private String color;
    public Car(String engine, String color) {
        this.engine = engine;
        this.color = color;
    }
    public String getEngine() {
        return engine;
    }
    public String getColor() {
        return color;
    }
    public void setEngine(String engine) {
        if (engine != null && !engine.isEmpty()) {
            this.engine = engine;
        } else {
            System.out.println("Не верное значение");
        }
    }
    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Не верное значение");
        }
    }
}

