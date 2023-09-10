import java.util.Scanner;

public class ArrayCheckDivisibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter an el: ");
            int el = s.nextInt();
            arr[i] = el;
        }

        System.out.println("The numbers divisible by 3 are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] % 3 == 0) {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
        System.out.println("The numbers divisible by 3 & 5 are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
        System.out.println("The numbers divisible by 3 or 5 are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
        System.out.println("The numbers divisible by 3 but not 7 are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 7 != 0) {
                System.out.print(arr[i]+" ");
            }
        }

        s.close();
    }
}
