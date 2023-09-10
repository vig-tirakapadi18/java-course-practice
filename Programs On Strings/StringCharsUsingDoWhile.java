import java.util.Scanner;

class StringCharsUsingDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.nextLine();

        char ch[] = str.toCharArray();

        int i = 0;
        do {
            System.out.println(ch[i]);
            i++;
        }while(i <= ch.length - 1);

        s.close();
    }    
}
