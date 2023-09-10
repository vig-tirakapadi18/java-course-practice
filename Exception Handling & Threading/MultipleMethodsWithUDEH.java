import java.util.Scanner;

class Program4 {
    void display() {
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
            System.out.println("Exception is Handled in display1!");
        }
        
        System.out.println("display1 Execution ended!");
    }
}

class Program5 {
    void display2() {
        System.out.println("display2 Execution started!");

        Program4 p4 = new Program4();
        p4.display();
        System.out.println();

        System.out.println("display2 Execution ended!");
    }
}

class Program6 {
    void display3() {
        System.out.println("display3 Execution started!");
        Program5 p5 = new Program5();
        p5.display2();
        System.out.println("display3 Execution ended!");
    }
}

class MultipleMethodsWithUDEH {
    public static void main(String[] args) {
        System.out.println("Main Execution started!");
        Program6 p6 = new Program6();
        p6.display3();
        System.out.println("Main execution ended!");
    }
}
