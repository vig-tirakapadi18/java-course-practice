class Parent10 {
    void display() {
        System.out.println("Parent!");
    }
} 

class Child10 extends Parent10 {
    void display() {
        System.out.println("Child!");
    }
}

public class MathodHiding1 {
    public static void main(String[] args) {
        Parent10 p = new Parent10();
        Child10 c = new Child10();
        p.display();
        c.display();

        Parent10 p1 = new Child10();
        p1.display();
    }
}
