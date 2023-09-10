class Parent11 {
    static void display() {
        System.out.println("Parent!");
    }
}

class Child11 extends Parent11 {
    static void display() {
        System.out.println("Child!");
    }
}

public class MethodHiding2 {
    public static void main(String[] args) {
        // Parent11 p = new Parent11();
        // p.display(); 
        // --->Parent11.display();
        // Child11 c = new Child11();
        // c.display(); 
        // --->Child11.display();
    }
}
