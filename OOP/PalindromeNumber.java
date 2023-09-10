import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = s.nextInt();

        System.out.println("Enter second number: ");
        int second = s.nextInt();

        int rem, rev = 0;

        while(first > 0) {
            rem = first % 10;
            first = first / 10;
            rev = (rev * 10) + rem;
        }

        if (rev == second) {
            System.out.println("PALENDROME!");
        } else {
            System.out.println("NOT-PALENDROME!");
        }

        s.close();
    }    
}
