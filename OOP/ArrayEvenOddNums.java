import java.util.Scanner;

public class ArrayEvenOddNums {
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

        System.out.println("The Original array elements are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("The EVEN elements of an array are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
        System.out.println("The ODD elements of an array are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }

        s.close();
    }
}
