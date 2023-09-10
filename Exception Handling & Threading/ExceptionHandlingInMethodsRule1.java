class Parent1 {
    void display() throws Exception {
        System.out.println("Parent throwing an error!");
    }
}

class Child1 extends Parent1 {  //It is not mandatory for child class method is not thrwing an 
                                //error if parent class method is throwing
    void display() {
        System.out.println("Child NOT throwing an error!");
    }
}

class ExceptionHandlingInMethodsRule1 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.display();
    }
}
