import java.util.Scanner;

class ATM {
    void takeMoney() throws Exception {
        try {
            System.out.println("Transaction started!");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter pin: ");
            int pin = s.nextInt();
            System.out.println(pin);
            System.out.println("Collect your Money!");
            s.close();
        } catch(Exception e) {
            System.out.println("Exception Handled in ATM!");
            e.printStackTrace();
            throw e;
        } finally{
            System.out.println("Transaction Ended!");
        }
    }
}

class Bank {
    void initate() {
        try {
            System.out.println("Connection established!");
            ATM a = new ATM();
            a.takeMoney();
        } catch(Exception e) {
            System.out.println("Exception Handled in Bank");
            e.printStackTrace();
        }finally {
            System.out.println("Connection terminated!");
        }
    }
}

class RethrowingAnException2 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initate();
    }
}
