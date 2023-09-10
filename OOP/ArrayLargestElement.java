import java.util.Scanner;

public class ArrayLargestElement {
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

        int largest = arr[0];
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The LARGEST element is: "+largest);
        s.close();
    }
}
