class Value {
    private int x = 22;
    int y = 66;
    
    void display() {
        System.out.println(x);
    }
}

class ChangeValue extends Value {
    void display1() {
        // x = 33;    //Can't inherit private variable - Supporting Encapsulation
        // System.out.println(x);
    }

    void display2() {
        System.out.println(y);
    }
}

public class EncapsulationWithInheritance {
    public static void main(String[] args) {
        ChangeValue cv = new ChangeValue();
        cv.display();
        cv.display1();
        cv.display2();
    }
}
