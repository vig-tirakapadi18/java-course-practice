class Employee2 {
    private String name;
    private int salary;

    public Employee2(String name, int salary) {
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

public class Constructors1 {
    public static void main(String[] args) {
        Employee2 emp2 = new Employee2("ABC", 35000);

        System.out.println(emp2.getName());
        System.out.println(emp2.getSalary());
    }
}
