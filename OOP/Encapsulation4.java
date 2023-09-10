class Employee1 {
    private String name;
    private int salary;

    public void setData(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Encapsulation4 {
    public static void main(String[] args) {
        Employee1 e = new Employee1();

        e.setData("Alpha", 40000);

        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
