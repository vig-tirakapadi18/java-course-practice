class Parent2 {
    void display() throws Exception {
        System.out.println("Parent throws an exception!");
    }
}

class Child2 extends Parent2 {
    void display() throws Exception {
        System.out.println("Child throws same exception as the parent class mathod");
    }
}

class ExceptionHandlingInMethodsRule2 {
    public static void main(String[] args) {
        try {
            Child2 c = new Child2();
            c.display();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
