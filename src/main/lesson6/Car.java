package main.lesson6;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2022);
        Car car2 = new Car("Toyota", 2021);

        System.out.println("Car1 " + car1);
        System.out.println("Car2 " + car2);

        if (car1.equals(car2)) {
            System.out.println("Машины одинаковые.");
        } else {
            System.out.println("Машины разные.");
        }
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car otherCar = (Car) obj;
        return year == otherCar.year && brand.equals(otherCar.brand);
    }

    /*
    // Сравнивает объекты только по марке
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car otherCar = (Car) obj;
        return brand.equals(otherCar.brand);
    }
    */
}

