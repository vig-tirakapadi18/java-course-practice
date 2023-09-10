import java.util.*;

class NumOfWordsInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sent = s.nextLine();

        char ch[] = sent.toCharArray();
        int count = 1;

        for(int i = 0; i <= ch.length - 1; i++) {
            if(ch[i] == ' ' && ch[i+1] != ' ') {
                count++;
            }
        }

        System.out.println("The Number of Words in Sentence: "+count);
        s.close();
    }    
}
