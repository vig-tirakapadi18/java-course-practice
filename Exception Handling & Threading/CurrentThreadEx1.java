class JavaSession implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);

        try {
            for(int i = 0; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } 
    }   
}

class CurrentThreadEx1 {
    public static void main(String[] args) {
        JavaSession js = new JavaSession();
        Thread t1 = new Thread(js);
        Thread t2 = new Thread(js);

        t1.setName("Vig");
        t2.setName("Vis");
        t1.start();
        t2.start();
    }
}