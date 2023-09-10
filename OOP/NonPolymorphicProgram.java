class Vehicle {
    void carry() {
        System.out.println("Carrying passengers!");
    }

    void speed() {
        System.out.println("Vahicle has speed!");
    }
}

class Bike extends Vehicle {
    void carry() {
        System.out.println("Bike carries 2 people!");
    }

    void speed() {
        System.out.println("Bike is not that fast!");
    }
}

class Car extends Vehicle {
    void carry(){
        System.out.println("Car carries 6 people!");
    }

    void speed() {
        System.out.println("Car is faster!");
    }
}

class Bus extends Vehicle {
    void carry() {
        System.out.println("Bus carries 45 people!");
    }

    void speed() {
        System.out.println("Bus is not that fast!");
    }
}

class NonPolymorphicProgram {
    public static void main(String[] args) {
        Bike bk = new Bike();
        Car cr = new Car();
        Bus bs = new Bus();

        bk.carry();
        bk.speed();

        cr.carry();
        cr.speed();

        bs.carry();
        bs.speed(); 
    }
}