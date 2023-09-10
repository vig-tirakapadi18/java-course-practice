import java.util.*;

class CopyingString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        char ch[] = str.toCharArray();
        char ch2[] = new char[ch.length];

        for(int i = 0; i <= ch.length - 1; i++) {
            ch2[i] = ch[i];
        }

        String copiedString = new String(ch2);
        System.out.println("The copied string is: "+copiedString);
        s.close();
    }
}
