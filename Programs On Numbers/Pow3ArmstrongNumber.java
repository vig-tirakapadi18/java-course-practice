import java.util.Scanner;

class Pow3ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();

        int temp = 0, cube = 0, sum = 0, x = num;

        if (num > 0) {
            while (num > 0) {
                temp = num % 10;
                cube = temp ^ 3;
                sum = sum + cube;
            }
        }

        if (x == sum) {
            System.out.println("ARMSTRONG NUMBER!");
        } else {
            System.out.println("NOT-ARMSTRONG NUMBER!");
        }
        s.close();
    }
}
