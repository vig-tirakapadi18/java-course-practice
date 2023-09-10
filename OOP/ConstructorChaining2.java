class Parent1 {
    int x, y;

    public Parent1() {
        super();
        System.out.println("Parent1 0-Para Constructor!");
        x = 11;
        y = 22;
    }

    public Parent1(int x) {
        super();
        System.out.println("Parent1 1-Para Constructor!");
        this.x = x;
        y = 33;
    }

    public Parent1(int x, int y) {
        super();
        System.out.println("Parent1 2-Para Constructor!");
        this.x = x;
        this.y = y;
    }
}

class Child1 extends Parent1 {
    int a, b;

    public Child1() {
        super(111, 222);
        System.out.println("Child1 0-Para Constructor!");
        a = 999;
        b = 888;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class ConstructorChaining2 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.display();
    }
}
