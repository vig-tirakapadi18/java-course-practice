class CurrentThread {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t);
        t.setName("Vig");
        System.out.println(t);
        t.setPriority(2);
        System.out.println(t);
    }    
}
