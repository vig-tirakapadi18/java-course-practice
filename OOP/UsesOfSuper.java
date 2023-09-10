class Super1 {
    int x = 111;

    void display1() {
        System.out.println(x);
    }
}

class Super2 extends Super1 {
    int x = 222;

    void display2() {
        System.out.println(x);
    }
}

class Super3 extends Super2 {
    int x = 333;

    void display3() {
        System.out.println(x);
        System.out.println(super.x);
        // System.out.println(super.super.x); //Grand Parent variable - Not Possible
    }
}

public class UsesOfSuper {
    public static void main(String[] args) {
        Super3 s = new Super3();
        s.display3();
    }
}
