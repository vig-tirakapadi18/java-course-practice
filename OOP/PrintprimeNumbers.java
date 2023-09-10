import java.util.Scanner;

class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = s.nextInt();

        int temp = 0;

        System.out.println("The prime numbers are: ");

        for(int i = 1; i <= n; i++) {
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    temp++;
                }
            }

            if(temp == 0) {
                System.out.print(i+" ");
            } else {
                temp = 0;
            }
        }
        s.close();
    }
}