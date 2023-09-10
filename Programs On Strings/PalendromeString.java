import java.util.*;

class PalendromeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st string: ");
        String str1 = s.nextLine();
        // int len1 = str1.length();
        
        System.out.println("Enter 2nd string: ");
        String str2 = s.nextLine();
        // int len2 = str2.length();

        char ch[] = str1.toCharArray();
        char rev[] = new char[ch.length];

        for(int i = 0; i <= ch.length - 1; i++) {
            rev[ch.length - 1 - i] = ch[i];
        }

        String reversed = new String(rev);

        if(reversed.equals(str2)) {
            System.out.println("PALENDROME!");
        } else {
            System.out.println("NOT-PALENDROME!");
        }

        s.close();
    }    
}
