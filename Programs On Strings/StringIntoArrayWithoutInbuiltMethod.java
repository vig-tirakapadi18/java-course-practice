class StringIntoArrayWithoutInbuiltMethod {
    public static void main(String[] args) {
        String str = "Vighnesh!";
        char ch[] = new char[str.length()];

        for(int i = 0; i <= ch.length - 1; i++) {
            char c = str.charAt(i);
            ch[i] = c;
        }

        for(int i = 0; i <= ch.length - 1; i++) {
            System.out.print(ch[i]+" ");
        }
    }    
}
