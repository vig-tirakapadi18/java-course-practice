import java.util.*;

public class ArrayEvenOddIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        System.out.println("The EVEN Indexes are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(i % 2 == 0) {
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("The ODD Indexes are: ");
        for(int i = 0; i <= arr.length - 1; i++) {
            if(i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
        s.close();
    }
}
