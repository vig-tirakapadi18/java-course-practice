class Animal {
    void sleep() {
        System.out.println("Sleeping!");
    }
}

class Carnivorous extends Animal {
    void food() {
        System.out.println("Eat Flesh!");
    }
}

class Omnivorous extends Animal {
    void food() {
        System.out.println("Eat Flesh and Veg!");
    }
}

class Herbivorous extends Animal {
    void food(){
        System.out.println("Eat Veg!");
    }
}

class Tiger extends Carnivorous {
    void hunt() {
        System.out.println("Hunting!");
    }
}

class Dog extends Omnivorous {
    void bark() {
        System.out.println("Barking!");
    }
}

class Cow extends Herbivorous {
    void lactate() {
        System.out.println("Lactating!");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Carnivorous cr = new Carnivorous();
        Omnivorous om = new Omnivorous();
        Herbivorous hb = new Herbivorous();

        Tiger tg = new Tiger();
        Dog dg = new Dog();
        Cow cw = new Cow();

        cr.sleep();
        cr.food();

        om.sleep();
        om.food();

        hb.sleep();
        hb.food();

        tg.sleep();
        tg.food();
        tg.hunt();

        dg.sleep();
        dg.food();
        dg.bark();

        cw.sleep();
        cw.food();
        cw.lactate();
    }
}
