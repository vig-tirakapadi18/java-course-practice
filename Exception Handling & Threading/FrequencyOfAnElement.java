import java.util.Scanner;

public class FrequencyOfAnElement {
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

        System.out.println("The original elements of an array are: ");
        for(int i = 0; i <= arr.length- 1; i++) {
            System.out.print(arr[i]+" ");
        }

        int count = 0;
        System.out.println();
        System.out.println("Enter an element to check frequency: ");
        int el = s.nextInt();
        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] == el) {
                count++;
            }
        }
        System.out.println("The frequency is: "+count);
        s.close();
    }
}
