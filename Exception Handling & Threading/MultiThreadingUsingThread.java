import java.util.Scanner;

class Add extends Thread {
    public void run() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st num: ");
            int n1 = s.nextInt();
            System.out.println("Enter 2nd num: ");
            int n2 = s.nextInt();

            int res = n1 + n2;
            Thread.sleep(3000);
            System.out.println(res);
            s.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class Print extends Thread {
    public void run() {
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

class MultiThreadingUsingThread {
    public static void main(String[] args) {
        Add pa = new Add();
        Print pp = new Print();
        pa.start();
        pp.start();
    }
}
