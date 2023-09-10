class GrandParent {
    void eat() {
        System.out.println("Eating!");
    }
}

class Parent extends GrandParent {
    void sleep() {
        System.out.println("Sleeping!");
    }
}

class Children extends Parent {
    void cook() {
        System.out.println("Cooking!");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        Children c = new Children();

        p.eat();
        p.sleep();

        c.eat();
        c.sleep();
        c.cook();
    }
}
