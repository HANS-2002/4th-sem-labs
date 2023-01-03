class Vehicle {
    public void move() {
        System.out.println("Vehicles can move.");
    }
}

class Car extends Vehicle {
    public void move() {
        System.out.println("Cars can stop and speed.");
    }
}

public class prog {
    public static void main(String args[]) {
        Vehicle a = new Vehicle();
        Vehicle b = new Car();
        a.move();
        b.move();
    }
}