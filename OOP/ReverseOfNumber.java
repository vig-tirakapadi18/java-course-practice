import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int n = s.nextInt();

        int rem = 0;
        int rev = 0;

        while(n > 0) {
            rem = n % 10;
            n = n / 10;
            rev = (rev * 10) + rem;
        }
        
        System.out.println("The reverse of number is "+rev);
        s.close();
    }
}
