import java.util.Scanner;

class StringReverse {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String str = s.nextLine();

       char ch[] = str.toCharArray();
       char rev[] = new char[ch.length];

       for(int i = 0; i <= ch.length - 1; i++) {
        rev[ch.length - 1 - i] = ch[i];
       }

       String reversedStr = new String(rev);
       System.out.println("The Original String: "+ str);
       System.out.println("The Reversed String: "+reversedStr);
       s.close();
    }    
}
