import java.util.*;

class NumOfVowelsInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        char ch[] = str.toCharArray();
        int count = 0;

        for(int i = 0; i <= ch.length - 1; i++) {
           if(ch[i] == 'a' || ch[i] == 'A' || 
                ch[i] == 'e' || ch[i] == 'E' || 
                ch[i] == 'i' || ch[i] == 'I' || 
                ch[i] == 'o' || ch[i] == 'O' || 
                ch[i] == 'u' || ch[i] == 'U'
            ) {
                count++;
            }
        }

        System.out.println("The Number of Vowels: "+count);
        s.close();
    }
}
