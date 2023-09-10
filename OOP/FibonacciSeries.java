import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3;

        for(int i = 0; i < n; i++) {
            System.out.print(n1+" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        s.close();
    }
}