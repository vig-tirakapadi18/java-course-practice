import java.util.*;

class Anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = s.nextLine().toLowerCase();
        System.out.println("Enter a string to check Anagram: ");
        String str2 = s.nextLine().toLowerCase();

        char strArr1[] = str1.toCharArray();
        char strArr2[] = str2.toCharArray();

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);

       boolean isEqual = Arrays.equals(strArr1, strArr2);

       if(str1.length() == str2.length()) {
        if(isEqual) {
            System.out.println("Both Strings are ANAGRAMS!");
        } else {
            System.out.println("Both Strings are NOT-ANAGRAMS!");
        }
       } else {
        System.out.println("Both Strings must be of same length!");
       }
       s.close();
    }    
}
