class Students extends Thread {
    String book1 = "Java";
    String book2 = "SQL";
    String book3 = "Python";

    public void run() {
        if (getName().equals("abc")) {
            abcThread();
        } else {
            xyzThread();
        }
    }

    void abcThread() {
        try {
            synchronized (book1) {
                System.out.println("abc is learning " + book1);
                Thread.sleep(2000);
                synchronized (book2) {
                    System.out.println("abc is learning " + book2);
                    Thread.sleep(2000);
                    synchronized (book3) {
                        System.out.println("abc is leaning " + book3);
                        Thread.sleep(2000);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void xyzThread() {
        try {
            synchronized (book1) {
                System.out.println("xyz is learning " + book1);
                Thread.sleep(2000);
                synchronized (book2) {
                    System.out.println("xyz is learning " + book2);
                    Thread.sleep(2000);
                    synchronized (book3) {
                        System.out.println("xyz is learning " + book3);
                        Thread.sleep(2000);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SynchrozinedBlock {
    public static void main(String[] args) {
        Students st1 = new Students();
        Students st2 = new Students();

        st1.setName("abc");
        st2.setName("xyz");

        st1.start();
        st2.start();
    }
}