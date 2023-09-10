import java.util.Scanner;

class UserDefinedExceptionHandler {
    public static void main(String[] args) {
        try {
            System.out.println("Execution Started!");
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
        System.out.println("Execution ended!");
    }    
}
