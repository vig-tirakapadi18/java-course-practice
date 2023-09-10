import java.util.Scanner;

class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        int temp = 0, rev = 0, x = num;

        if (num > 0) {
            while (num > 0) {
                temp = num % 10;
                rev = (rev * 10) + temp;
                num = num / 10;
            }
        }

        System.out.println("Reverse of a number " + x + " is: " + rev);
        s.close();
    }
}
