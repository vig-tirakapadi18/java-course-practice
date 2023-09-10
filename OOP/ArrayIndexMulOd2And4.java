import java.util.Scanner;

public class ArrayIndexMulOd2And4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = s.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i <= arr.length - 1; i++){
            if(i % 2 == 0 && i % 4 == 0) {
                System.out.print(i+" ");
            }
        }
        s.close();
    }
}
