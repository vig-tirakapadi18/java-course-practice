import java.util.Scanner;

class Program9 {
    void display1() throws Exception {
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
            System.out.println("Exception Handled in Program9!");
            throw e;
        } finally {
            System.out.println("display1 Execution ended!");
        }
    }
}

class Program10 {
    void display2() {
        System.out.println("display2 Execution started! ");
        try {
            Program9 p9 = new Program9();
            p9.display1();
        } catch(Exception e) {
            System.out.println("Exception Handled in Program10!");
        }
        System.out.println("display2 Execution ended!");
    }
}

class RethrowingAnException {
    public static void main(String[] args) {
        Program10 p10 = new Program10();
        p10.display2();
    }
}
