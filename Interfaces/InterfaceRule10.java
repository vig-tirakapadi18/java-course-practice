interface Methods {
    void display1();    //public abstract method - allowed

    default void display2() {
        System.out.println("Default method!");      //default method - allowed
    }

    static void display3() {
        System.out.println("Static method!");       //public abstract method - allowed
    }
}

class MethodDisplay implements Methods {
    public void display1() {
        System.out.println("Public Abstarct method!");
    }
}

public class InterfaceRule10 {
    public static void main(String[] args) {
        MethodDisplay md = new MethodDisplay();
        md.display1();
        md.display2();
        Methods.display3();
    }
}
