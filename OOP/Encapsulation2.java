class Program1 {
    private String name;
    private int kodId;

    public void setData(String n, int id) {
        name = n;
        kodId = id;
    }

    public String getName() {
        return name;
    }

    public int getKodId() {
        return kodId;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Program1 p = new Program1();

        p.setData("Vighnesh", 101);

        System.out.println(p.getName());
        System.out.println(p.getKodId());
    }
}
