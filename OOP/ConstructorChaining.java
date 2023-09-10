class Program101 {
    int x, y;

    public Program101() {
        super();
        System.out.println("Program101 0-Para Constructor!");
        x = 22;
        y = 33;
    }

    public Program101(int x) {
        super();
        this.x = x;
        y = 44;
    }

    public Program101(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
}

class Program202 extends Program101 {
    int p, q;

    public Program202() {
        super();
        System.out.println("Program202 0-Para Constructor!");
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Program202 p202 = new Program202();

        p202.display();
    }
}
