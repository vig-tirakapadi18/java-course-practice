abstract class Emp1 {
    abstract void work();
    abstract void project();
}

class Dev1 extends Emp1 {
    void work() {
        System.out.println("Dev is Working!");
    }

    void project() {
        System.out.println("Dev is doing Project!");
    }
}

class Tester1 extends Emp1 {
    void work() {
        System.out.println("Tester is Working!");
    }

    void project() {
        System.out.println("Tester is doing Project!");
    }
}

class Comp {
    void job(Emp1 ref) {
        ref.work();
        ref.project();
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Dev1 dev = new Dev1();
        Tester1 test = new Tester1();

        Comp comp = new Comp();
        comp.job(dev);
        comp.job(test);
    }
}
