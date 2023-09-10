import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int temp = 0;

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                temp++;
            }
        }

        if(temp > 0) {
            System.out.println("NON-PRIME NUMBER!");
        } else {
            System.out.println("PRIME NUMBER!");
        }

        s.close();
    }
}
