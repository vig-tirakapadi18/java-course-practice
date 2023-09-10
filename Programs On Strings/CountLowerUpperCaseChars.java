import java.util.*;

class CountLowerUpperCaseChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        char ch[] = str.toCharArray();

        int countUpper = 0;
        int countLower = 0;
        int countSpecial = 0;
        int countNum = 0;

        for(int i = 0; i <= ch.length - 1; i++) {
            int el = ch[i];
            if (el >= 65 && el <= 90) {
                countUpper++;
            }

            if (el >= 97 && el <= 122) {
                countLower++;
            }

            if (el >= 32 && el <= 47 || 
                el >= 58 && el <= 64 || 
                el >= 91 && el <= 96 || 
                el >= 123 && el <= 126
            ) {
                countSpecial++;
            }

            if (el >= 48 && el <= 57) {
                countNum++;
            }
        }

        System.out.println("Number of Upper Case chars : "+countUpper);
        System.out.println("Number of Lower Case chars : "+countLower);
        System.out.println("Number of Special Chars: "+countSpecial);
        System.out.println("Number of Numbers: "+countNum);
        s.close();
    }
}
