import java.util.Scanner;

class PrimeNumbersOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter an el: ");
            int el = s.nextInt();
            arr[i] = el;
        }

        System.out.println("The Original Array Elements are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }

        int temp = 0;
        System.out.println();
        System.out.println("The Prime Numbers of Array are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            for(int j = 2; j <= arr.length - 1; j++) {
                if(arr[i] % j == 0) {
                    temp++;
                }
            }
            if(temp == 0) {
                System.out.print(arr[i]+" ");
            } else {
                temp = 0;
            }
        }

        s.close();
    }
}