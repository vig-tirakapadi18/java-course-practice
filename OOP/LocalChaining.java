class Parent2 {
    int x, y;

    public Parent2() {
        super();
        System.out.println("Parent 0-Para Constructor!");
        x = 1000;
        y = 2000;
    }

    public Parent2(int x) {
        this();
        System.out.println("Parent 1-Para Constructor!");
        this.x = x;
        y = 3333;
    }

    public Parent2(int x, int y) {
        super();
        System.out.println("Parent 2-Para Constructor!");
        this.x = x;
        this.y = y;
    }
}

class Child2 extends Parent2 {
    int a, b;

    public Child2() {
        this(777, 666);
        System.out.println("Child 0-Para Constructor!");
        a = 5555;
        b = 6666;
    }

    public Child2(int a, int b) {
        super(999);
        System.out.println("Child 2-Para Constructor!");
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class LocalChaining {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.display();
    }
}
