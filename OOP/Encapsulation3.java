class Employee {
    private String name;
    private int salary;

    public void setData(String n, int s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setData("Vig", 35000);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}
