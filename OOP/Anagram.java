import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter FIRST String: ");
        String str1 = s.nextLine();
        System.out.println("Enter SECOND String: ");
        String str2 = s.nextLine();

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);

       boolean comp = Arrays.equals(arr1,arr2);

       if(str1.length() == str2.length()) {
        if(comp) {
            System.out.println("ANAGRAMS!");
        } else {
            System.out.println("NOT ANAGRAMS!");
        }
       } else {
        System.out.println("The both Strings must be of same length!");
       }

       s.close();
    }
}
