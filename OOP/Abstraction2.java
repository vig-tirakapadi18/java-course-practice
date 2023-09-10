import java.util.Scanner;

abstract class Shape {
    float area = 0;

    abstract void takeInput();
    abstract void calc();
    abstract void display();
}

class Square extends Shape {
    int side = 0;
    void takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side of Square: ");
        side = s.nextInt();
        s.close();
    }

    void calc() {
        area = side * side;
    }

    void display() {
        System.out.println("Area of Square is: "+area);
    }
}

class Rectangle extends Shape {
    float l = 0;
    float b = 0;

    void takeInput() {
        Scanner s = new Scanner( System.in);
        System.out.println("Enter Length: ");
        l = s.nextFloat();
        System.out.println("Enter Breadth: ");
        b = s.nextFloat();
        s.close();
    }

    void calc() {
        area = l * b;
    }

    void display() {
        System.out.println("Area of Rectangle is: "+area);
    }
}

class Circle extends Shape {
    int rad = 0;
    float pi = 3.142F;  

    void takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius: ");
        rad = s.nextInt();
        s.close();
    }

    void calc() {
        area = 2 * pi * rad;
    }

    void display() {
        System.out.println("Area of Circle is: "+area);
    }
}

class CalcArea {
    void calculateArea(Shape ref) {
        ref.takeInput();
        ref.calc();
        ref.display();
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Square sq = new Square();
        Rectangle rect = new Rectangle();
        Circle cr = new Circle();

        CalcArea ca = new CalcArea();
        ca.calculateArea(sq);
        ca.calculateArea(rect);
        ca.calculateArea(cr);
    }
}
