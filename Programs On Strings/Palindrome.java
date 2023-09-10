import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = s.nextLine().toLowerCase();
        System.out.println("Enter a string to check Palindrome: ");
        String str2 = s.nextLine().toLowerCase();

        char strArr1[] = str1.toCharArray();
        char revStrArr[] = new char[str1.length()];

        for(int i = 0; i <= strArr1.length - 1; i++) {
            revStrArr[strArr1.length - 1 - i] = strArr1[i];
        }

        String revStr = new String(revStrArr);
        if(str1.length() == str2.length()) {
            if(str2.equals(revStr)) {
                System.out.println("Both Strings are PALINDROME! (Ignoring Case)");
            } else {
                System.out.println("Both Strings are NOT-PALINDROME! (Ignoring Case)");
            }
        } else {
            System.out.println("Both Strings length must be Equal!");
        }
        s.close();
    }    
}
