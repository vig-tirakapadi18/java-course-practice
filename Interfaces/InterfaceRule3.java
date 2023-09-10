interface Display {
    void display1();
    void display2();
}

abstract class DisplayClass implements Display {
    public void display1() {
        System.out.println("display1 of DisplayClass!");
    }
}

class AnotherDisplayClass extends DisplayClass {
    public void display2() {
        System.out.println("display2 of AnotherDisplayClass!");
    }
}

public class InterfaceRule3 {
    public static void main(String[] args) {
        // DisplayClass dc = new DisplayClass();    //Can't instantiate the abstract class
        // dc.display1();
        // dc.display2();
        AnotherDisplayClass adc = new AnotherDisplayClass();
        adc.display1();
        adc.display2();
    }
}
