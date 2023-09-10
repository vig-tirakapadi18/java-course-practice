import java.util.*;

class StringSecondHalf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();
        int len = str.length();
        int halfLen = len / 2;
        
        char ch[] = str.toCharArray();

        for(int i = halfLen; i <= ch.length - 1; i++) {
            System.out.println(ch[i]+" ");
        }
        s.close();
    }    
}
