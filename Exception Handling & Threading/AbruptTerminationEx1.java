import java.util.Scanner;

class AbruptTerminationEx1 {
    public static void main(String[] args) {
        System.out.println("Execution Started!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int n1 = s.nextInt();
        System.out.println("Enter num 2: ");
        int n2 = s.nextInt();   //After entering 0 : Abrupt termination happens
                                //Exception in thread "main" java.lang.ArithmeticException: / by zero
        s.close();

        int div = n1 / n2;

        System.out.println(div);

        System.out.println("Execution Ended!");
    }    
}
