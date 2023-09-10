import java.util.Scanner;

public class FetchCharOfString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        System.out.println("Enter a Index of char to be fetched: ");
        int idx = s.nextInt();
        char ch = str.charAt(idx);

        int len = str.length();

        System.out.println("The char is: "+ch);
        System.out.println("The length of string is: "+len);
        s.close();
    }
}
