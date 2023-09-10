import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        int sum = 0, temp = 0, x = num;

        if (num > 0) {
            while (num > 0) {
                temp = num % 10;
                sum += temp;
                num = num / 10;
            }
        }

        System.out.println("The sum of digits of " + x + " is: " + sum);
        s.close();
    }
}
