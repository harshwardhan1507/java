package javakb.ch07_oop;

class Car {

    String brand;
    String model;
    double speed;

    Car(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    void accelerate() {
        speed += 10;
        System.out.println("Car accelerated");
    }

    void brake() {
        speed -= 10;
        System.out.println("Brake applied");
    }

    void display() {
        System.out.println("Speed: " + this.speed);
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println();
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Mustang", 89.99);

        Car car2 = new Car("BMW", "M4", 120.4);

        car1.accelerate();
        car1.display();

        car2.accelerate();
        car2.display();

        car1.brake();
        car2.brake();
    }
}