import java.util.Scanner;

class DLException extends Exception {
    public String getMessage() {
        return "Invalid Age!";
    }
}

class DL {
    void getDL() throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = s.nextInt();
        s.close();
        if(age > 18 && age < 55) {
            System.out.println("You are eligible to take DL!");
        } else {
            DLException e = new DLException();
            throw e;
        }
    }
}

class CustomException {
    public static void main(String[] args) {
        try {
            DL dl = new DL();
            dl.getDL();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
