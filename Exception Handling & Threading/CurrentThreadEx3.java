class JavaSession1 implements Runnable {
    public void run() {
        System.out.println("Student Joined!");
        try {
            for(int i = 0; i <= 5; i++) {
                System.out.println("Student is attending!");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Student Left!");
    }
}

class CurrentThread3 {
    public static void main(String[] args) {
        try {
            System.out.println("Java session started!");
            JavaSession1 js = new JavaSession1();
            Thread t = new Thread(js);
            t.start();
            t.join();
            System.out.println("Java session ended!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}