abstract class Demo101 {
    abstract void display1();
    abstract void display2();
}

class Demo102 extends Demo101{
    void display1() {
        System.out.println("display1");
    }

    void display2() {
        System.out.println("display2");
    }
}

public class PureAbstraction {
    public static void main(String[] args) {
        Demo102 d102 = new Demo102();
        d102.display1();
        d102.display2();
    }
}
