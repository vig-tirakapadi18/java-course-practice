import java.util.Scanner;

class ArrayReadAndDisplay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter an element: ");
            int el = s.nextInt();
            arr[i] = el;
        }

        System.out.println("The elements of an array array are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }

        s.close();
    }
}