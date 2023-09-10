class SessionCond implements Runnable {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Session started!");
                Thread.sleep(2000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class AudioC implements Runnable {
    public void run() {
        try {
            for(; ;) {
                System.out.println("Audio check!");
                Thread.sleep(2000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class VideoC implements Runnable {
    public void run() {
        try {
            for(; ;) {
                System.out.println("Video Check!");
                Thread.sleep(2000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class DaemonThread {
    public static void main(String[] args) {
        SessionCond sc = new SessionCond();
        AudioC ac = new AudioC();
        VideoC vc = new VideoC();

        Thread t1 = new Thread(sc);
        Thread t2 = new Thread(ac);
        Thread t3 = new Thread(vc);

        t2.setDaemon(true);
        t3.setDaemon(true);

        t2.setPriority(1);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
