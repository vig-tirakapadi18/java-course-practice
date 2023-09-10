import java.util.Scanner;

class MultipleCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Connection Established!");
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st num: ");
            int n1 = s.nextInt();
            System.out.println("Enter 2nd num: ");
            int n2 = s.nextInt();
            
            int c = n1 / n2;
            System.out.println(c);

            System.out.println("Enter the size: ");
            int size = s.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter an element: ");
            int el = s.nextInt();

            System.out.println("Enter the index at which the element should be inserted: ");
            int i = s.nextInt();

            arr[i] = el;

            System.out.println("Element stored!");
            s.close();
        } catch(ArithmeticException ae) {
            System.out.println("Arithmetic Exception Handled!");
        } catch(NegativeArraySizeException nae) {
            System.out.println("Negative Array Size exception Handled!");
        } catch(ArrayIndexOutOfBoundsException aio) {
            System.out.println("Array Index Out Of Bounds Exception Handled!");
        } catch(Exception e) {
            System.out.println("Exception Handled!");
        }

        System.out.println("Connection Terminated!");
    }
}
