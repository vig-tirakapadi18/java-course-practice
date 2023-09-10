class Program1 {
    int x = 10;

    void display() {
        System.out.println("Program 01!");
    }
}

class Program2 extends Program1 {
    int y;

    public Program2() {
        super();
        y = 20;
    }

    void display() {
        System.out.println(y);
    }
}

public class ExeOfConstructorInInheritance {
    public static void main(String[] args) {
        Program2 p2 = new Program2();
        p2.display();
    }
}
