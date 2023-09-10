import java.util.Scanner;

class Program11 {
    void display1() throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int n1 = s.nextInt();
        System.out.println("Enter 2nd num: ");
        int n2 = s.nextInt();

        int c = n1 / n2;
        System.out.println(c);
        s.close();
    }
}

class Program12 {
    void display2() {
        System.out.println("display2 Execution started!");
        try {
            Program11 p11 = new Program11();
            p11.display1();
        } catch(Exception e) {
            System.out.println("Exception is handled!");
        }
        System.out.println("display2 Execution ended!");
    }
}

class DuckingAnException {
    public static void main(String[] args) {
        Program12 p12 = new Program12();
        p12.display2();
    }
}
