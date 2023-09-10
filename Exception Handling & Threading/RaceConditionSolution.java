class RaceInterview implements Runnable {
    synchronized public void run() {
        String name = Thread.currentThread().getName();

        for (int i = 1; i <= 3; i++) {
            try {
                System.out.println(name + " is attending Interview!");
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class RaceConditionSolution {
    public static void main(String[] args) {
        RaceInterview ritw = new RaceInterview();

        Thread t1 = new Thread(ritw);
        Thread t2 = new Thread(ritw);
        Thread t3 = new Thread(ritw);

        t1.setName("X");
        t2.setName("Y");
        t3.setName("Z");

        t1.start();
        t2.start();
        t3.start();
    }
}
