class StringIntoArray {
    public static void main(String[] args) {
        String str = "Vighnesh";
        char ch[] = str.toCharArray();
        
        for(int i = 0; i <= ch.length - 1; i++) {
            System.out.print(ch[i]+ " ");
        }
    }    
}
