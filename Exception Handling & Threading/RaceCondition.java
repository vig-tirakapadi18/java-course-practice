class Interview implements Runnable {
    public void run() {
        try {
            String name = Thread.currentThread().getName();

            for (int i = 0; i <= 5; i++) {
                System.out.println(name + " is attending Interview!");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class RaceCondition {
    public static void main(String[] args) {
        Interview inw = new Interview();

        Thread t1 = new Thread(inw);
        Thread t2 = new Thread(inw);
        Thread t3 = new Thread(inw);

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");

        t1.start();
        t2.start();
        t3.start();
    }
}