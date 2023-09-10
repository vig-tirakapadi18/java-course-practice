class Program {
    private int count = 100;

    public void setCount(int x) {
        if(x > 0) {
            count = x;
        } else {
            System.out.println("Invalid Value!");
        }
    }

    public int getCount() {
        return count;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Program p = new Program();

        p.setCount(1000);
        System.out.println(p.getCount());
        p.setCount(-1000);
        System.out.println(p.getCount());
    }
}