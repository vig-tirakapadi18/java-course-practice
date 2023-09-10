abstract class Demo103 {
    void display1() {
        System.out.println("display1");
    }

    abstract void display2();
}

class Demo104 extends Demo103 {
    void display2() {
        System.out.println("display2");
    }
}

public class ImpureAbstraction1 {
    public static void main(String[] args) {
        Demo104 d104 = new Demo104();
        d104.display1();
        d104.display2();
    }
}
