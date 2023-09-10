abstract class Demo105 {
    void display1() {
        System.out.println("display1");
    }

    void display2() {
        System.out.println("display2");
    }
}

class Demo106 extends Demo105 {}

class ImpureAbstraction2 {
    public static void main(String[] args) {
        Demo106 d106 = new Demo106();
        d106.display1();
        d106.display2();
    }
}
