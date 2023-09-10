class SessionConducted extends Thread {
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

class AudioCheck extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Audio check!");
                Thread.sleep(2000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class VideoCheck extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Video Check!");
                Thread.sleep(2000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class NonDaemonThread {
    public static void main(String[] args) {
        SessionConducted sc = new SessionConducted();
        AudioCheck ac = new AudioCheck();
        VideoCheck vc = new VideoCheck();

        sc.start();
        ac.start();
        vc.start();
    }
}
