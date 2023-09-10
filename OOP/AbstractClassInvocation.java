abstract class Demo107 {
    abstract void display1();
    void display2() {
        System.out.println("display2 Demo107");
    }
}

class Demo108 extends Demo107 {
    void display1() {
        System.out.println("display1");
    }
}

class AbstractClassInvocation {
    public static void main(String[] args) {
        // Demo107 d107 = new Demo107();  //Error - Abstract class can never be instantiated
        Demo108 d108 = new Demo108();
        d108.display1();
        d108.display2();
    }
}
