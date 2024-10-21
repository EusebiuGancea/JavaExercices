public class Main {
    public static void main(String args[]) {
        Car car = new Car ("Tesla", "S_PLAID", "RED", 4);
        Plane plane = new Plane("Bowing", "Model", "WHITE AND BLUE", 4);
        car.move();
        car.stop();
        plane.move();
        plane.stop();
    }
}

class Vehicle {
    private String name;
    private String color;

    public Vehicle(String name, String color) {
        this.color = color;
        this.name = name;
    }

    public void move() {
        System.out.println("The vechicle " + this.name + " is moving.");
    }

    public void stop() {
        System.out.println("The vechicle " + this.name + " has stopped.");
    }
}

class Car extends Vehicle{
    private String model;
    private int doors;

    public Car(String name, String model, String color, int doors) {
        super(name, color);
        this.model = model;
        this.doors = doors;
    }
}

class Plane extends Vehicle{
    private String model;
    private int doors;
    private int engines;

    public Plane(String name, String model, String color, int doors) {
        super(name, color);
        this.model = model;
        this.doors = doors;
        this.engines = engines;
    }

    @Override
    public void move() {
        System.out.println("Moving by flying.");
        super.move();
    }
}