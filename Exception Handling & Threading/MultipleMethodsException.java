import java.util.Scanner;

class Program1 {
    void display() {
        System.out.println("display1 Execution started!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int n1 = s.nextInt();
        System.out.println("Enter 2nd num: ");
        int n2 = s.nextInt();

        int c = n1 / n2;
        System.out.println(c);
        s.close();

        System.out.println("display1 Execution ended!");
    }
}

class Program2 {
    void display2() {
        System.out.println("display2 Execution started!");

        Program1 p1 = new Program1();
        p1.display();
        System.out.println();

        System.out.println("display2 Execution ended!");
    }
}

class Program3 {
    void display3() {
        System.out.println("display3 Execution started!");
        Program2 p2 = new Program2();
        p2.display2();
        System.out.println("display3 Execution ended!");
    }
}

class MultipleMethodsException {
    public static void main(String[] args) {
        System.out.println("Main Execution started!");
        Program3 p3 = new Program3();
        p3.display3();
        System.out.println("Main execution ended!");
    }
}
