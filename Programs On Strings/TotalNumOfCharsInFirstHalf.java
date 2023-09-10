import java.util.*;

class TotalNumOfCharsInFirstHalf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        int count = 0;

        int len = str.length();
        int halfLen = len / 2;

        for(int i = 0; i <= halfLen - 1; i++) {
            count++;
        }

        System.out.println("The length of first half string is: "+count);
        s.close();
    }    
}
