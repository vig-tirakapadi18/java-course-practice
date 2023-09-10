import java.util.*;

class FrequencyOfGivenCharInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        System.out.println("Enter a char to check its frequency: ");
        char ch = s.next().charAt(0);

        char charArray[] = str.toCharArray();
        int count = 0;

        for(int i = 0; i <= charArray.length - 1; i++) {
            if(ch == charArray[i]) {
                count++;
            }
        }

        System.out.println("The frequency of '"+ch+"' in '"+str+"' is:  "+count);
        s.close();
    }    
}
