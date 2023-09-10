import java.util.Scanner;

interface MyCalc {
    void add();
    void sub();
    void mul();
    void div();
}

class Calc1 implements MyCalc {
    public void add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    public void sub() {
        int a = 10;
        int b = 5;
        int c = a - b;
        System.out.println(c);
    }

    public void mul() {
        int a = 20;
        int b = 10;
        int c = a * b;
        System.out.println(c);
    }

    public void div() {
        int a = 20;
        int b = 10;
        int c = a / b;
        System.out.println(c);
    }
}

class Calc2 implements MyCalc {
    public void add() {
        int a = 20, b = 20, c;
        c = a + b;
        System.out.println(c);
    }

    public void sub() {
        int a = 200, b = 50, c;
        c = a - b;
        System.out.println(c);
    }

    public void mul() {
        int a = 100, b = 23, c;
        c = a * b;
        System.out.println(c);
    }

    public void div() {
        int a = 200, b = 5, c;
        c = a / b;
        System.out.println(c);
    }
}

class Calc3 implements MyCalc {
    Scanner s = new Scanner(System.in);
    
    public void add() {
        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b: ");
        int b = s.nextInt();

        int c = a + b;
        System.out.println(c);
    }

    public void sub() {
        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b: ");
        int b = s.nextInt();

        int c = a - b;
        System.out.println(c);
    }

    public void mul() {
        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b: ");
        int b = s.nextInt();

        int c = a * b;
        System.out.println(c);
    }

    public void div() {
        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b: ");
        int b = s.nextInt();

        int c = a / b;
        System.out.println(c);
    }
}

class Calculator {
    void calculate(MyCalc ref) {
        ref.add();
        ref.sub();
        ref.mul();
        ref.div();
    }
}

class InterfaceRule2 {
    public static void main(String[] args) {
        Calc1 c1 = new Calc1();
        Calc2 c2 = new Calc2();
        Calc3 c3 = new Calc3();

        Calculator calc = new Calculator();
        calc.calculate(c1);
        calc.calculate(c2);
        calc.calculate(c3);
    }
}
