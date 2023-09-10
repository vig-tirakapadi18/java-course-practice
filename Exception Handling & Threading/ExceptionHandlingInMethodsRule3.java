class Parent3 {
    void display() throws Exception {
        System.out.println("Parent class!");
    }
}

class Child3 extends Parent3 {
    void display() throws ArithmeticException { //The overridden method exception and parent class 
                                                //method exception must be 
                                                //Parent-Child(Exception and ArithmeticException) relationship
        System.out.println("Child class throwing different exception!");
    }
}

class ExceptionHandlingInMethodsRule3 {
    public static void main(String[] args) {
        try {
            Child3 c = new Child3();
            c.display();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
