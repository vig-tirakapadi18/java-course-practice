import java.util.Scanner;

class StringLengthWithoutInbuiltMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        int len = 0;

        char ch[] = str.toCharArray();

        for(int i = 0; i <= ch.length - 1; i++) {
            len++;
        }

        System.out.println("The length of string is: "+len);
        s.close();
    }
}
