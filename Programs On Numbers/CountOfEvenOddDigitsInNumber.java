import java.util.Scanner;

class CountOfEvenOddDigitsInNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        int oddCount = 0, evenCount = 0;
        int temp = 0;

        if (num > 0) {
            while (num > 0) {
                temp = num % 10;
                if (temp % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                num = num / 10;
            }
        }

        System.out.println("The count of EVEN digits: " + evenCount);
        System.out.println("The count of ODD digits: " + oddCount);
        s.close();
    }
}
