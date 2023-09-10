import java.util.Scanner;

class ArrayToString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = s.nextInt();
        char ch[] = new char[size];

        for(int i = 0; i <= ch.length - 1; i++) {
            System.out.println("Enter a char: ");
            char el = s.next().charAt(0);
            ch[i] = el;
        }

        String str = new String(ch);

        System.out.println("The string of all the entered chars is: "+str);
        s.close();
    }
}