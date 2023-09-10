import java.util.*;

class EvenIndexChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        char ch[] = str.toCharArray();

        for(int i = 0; i <= ch.length - 1; i++) {
            if(i % 2 == 0) {
                System.out.print(ch[i]+" ");
            }
        }

        s.close();
    }
}
