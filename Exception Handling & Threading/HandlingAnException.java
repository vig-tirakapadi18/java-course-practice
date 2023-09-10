import java.util.Scanner;

class Program7 {
    void display1() {
        System.out.println("display1 Execution started!");
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st num: ");
            int n1 = s.nextInt();

            System.out.println("Enter 2nd num: ");
            int n2 = s.nextInt();

            int c = n1 / n2;
            System.out.println(c);
            s.close();
        } catch(Exception e) {
            System.out.println("Exception Handled!");
        } 
        System.out.println("display1 Execution ended!");
    }
}

class Program8 {
    void display2() {
        System.out.println("display2 Exception started!");
        Program7 p7 = new Program7();
        p7.display1();
        System.out.println("display2 Exception ended!");
    }
}

class HandlingAnException {
    public static void main(String[] args) {
        System.out.println("Main method execution started!");
        Program8 p8 = new Program8();
        p8.display2();
        System.out.println("Main method execution ended!");
    }
}
