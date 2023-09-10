import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();
        int temp = 0, rev = 0, x = num;

        if (num > 0) {
            while (num > 0) {
                temp = num % 10;
                rev = (rev * 10) + temp;
                num = num / 10;
            }
        }

        if (x == rev) {
            System.out.println("PALINDROME!");
        } else {
            System.out.println("NOT-PALINDROME!");
        }
        s.close();
    }
}
