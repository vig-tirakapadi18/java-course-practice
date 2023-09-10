import java.util.Scanner;

class StringLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        int len = str.length();
        System.out.println("The length of the string is: "+len);
        s.close();
    }    
}
