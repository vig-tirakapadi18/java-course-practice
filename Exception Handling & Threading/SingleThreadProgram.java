import java.util.Scanner;

public class SingleThreadProgram {
    public static void main(String[] args) {
        try {
            System.out.println("Activity started!");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st num: ");
            int n1 = s.nextInt();
            System.out.println("Enter 2nd num: ");
            int n2 = s.nextInt();

            int res = n1+n2;
            Thread.sleep(2000);
            System.out.println(res);
            System.out.println("Activity completed!");

            System.out.println("Printing started!");
            for(int i = 0; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(3000);
            }
            System.out.println("Printing completed!");
            s.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
