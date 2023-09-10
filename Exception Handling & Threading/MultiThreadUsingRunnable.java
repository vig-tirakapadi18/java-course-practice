import java.util.Scanner;

class Addition1 implements Runnable {
    public void run() {
        try{
            System.out.println("Addition activity started!");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st num: ");
            int n1 = s.nextInt();
            System.out.println("Enter 2nd num: ");
            int n2 = s.nextInt();

            int res = n1 + n2;
            Thread.sleep(2000);
            System.out.println(res);
            s.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Addition activity ended!");
    }
}

class Print1 implements Runnable {
    public void run() {
        try {
            System.out.println("Printing activity started!");
            for(int i = 0; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Printing activity ended!");
    }
}

class MultiThreadUsingRunnable {
    public static void main(String[] args) {
        Addition1 a = new Addition1();
        Print1 p = new Print1();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(p);
        t1.start();
        t2.start();
    }
}
