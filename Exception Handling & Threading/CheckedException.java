class CE {
    void activity() {
        try {
            for(int i = 0; i <= 5; i++) {
                System.out.println("Learning Java!");
                Thread.sleep(2000);
            }
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

class CheckedException {
    public static void main(String[] args) {
        CE ce = new CE();
        ce.activity();
    }
}