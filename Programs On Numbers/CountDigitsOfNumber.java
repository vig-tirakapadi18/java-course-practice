import java.util.Scanner;

class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        int count = 0, x = num;

        if (num > 0) {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("The digits in number " + x + " are: " + count);
        s.close();
    }
}