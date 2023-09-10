import java.util.Scanner;

class Calculator implements Runnable {
    public void run() {
        if(Thread.currentThread().getName().equals("ADD")) {
            add();
        } else if(Thread.currentThread().getName().equals("SUB")) {
            sub();
        } else if(Thread.currentThread().getName().equals("MUL")) {
            mul();
        } else if(Thread.currentThread().getName().equals("DIV")) {
            div();
        }
    }

    public void add() {
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

    public void sub() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st num: ");
            int n1 = s.nextInt();
            System.out.println("Enter 2nd num: ");
            int n2 = s.nextInt();

            int res = n1 - n2;
            Thread.sleep(3000);
            System.out.println(res);
            s.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void mul() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st num: ");
            int n1 = s.nextInt();
            System.out.println("Enter 2nd num: ");
            int n2 = s.nextInt();

            int res = n1 * n2;
            Thread.sleep(3000);
            System.out.println(res);
            s.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void div() {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter 1st num: ");
            int n1 = s.nextInt();
            System.out.println("Enter 2nd num: ");
            int n2 = s.nextInt();

            int res = n1 / n2;
            Thread.sleep(3000);
            System.out.println(res);
            s.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

class CurrentThreadEx2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);

        t1.setName("ADD");
        t2.setName("SUB");
        t3.setName("MUL");
        t4.setName("DIV");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
