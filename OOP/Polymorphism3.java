class Vehicle2 {
    void carry() {
        System.out.println("Carrying passengers!");
    }

    void speed() {
        System.out.println("Vahicle has speed!");
    }
}

class Bike2 extends Vehicle2 {
    void carry() {
        System.out.println("Bike2 carries 2 people!");
    }

    void speed() {
        System.out.println("Bike2 Speed!");
    }
}

class Car2 extends Vehicle2 {
    void carry(){
        System.out.println("Car carries 6 people!");
    }

    void speed() {
        System.out.println("Car Speed!");
    }
}

class Bus2 extends Vehicle2 {
    void carry() {
        System.out.println("Bus carries 45 people!");
    }

    void speed() {
        System.out.println("Bus Speed!");
    }
}

class Transport {
    void activity(Vehicle2 ref) {
        ref.carry();
        ref.speed();
    }
}

public class Polymorphism3 {
    public static void main(String[] args) {
        Bike2 bk = new Bike2();
        Car2 cr = new Car2();
        Bus2 bs = new Bus2();

        Transport tr = new Transport();

        tr.activity(bk);
        tr.activity(cr);
        tr.activity(bs);
    }
}
