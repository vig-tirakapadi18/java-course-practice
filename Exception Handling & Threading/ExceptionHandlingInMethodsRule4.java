class Parent4 {
    void display() throws ArithmeticException {
        System.out.println("Parent Exception!");
    }
}

class Child4 extends Parent4 {
    void display() throws ArrayIndexOutOfBoundsException {  //It is allowed if both the Child class 
                                                          //Overridden method and parent class mathod 
                                                          //throws RuntimeExceptions
        System.out.println("Child class throwing same run-time exception as parent class!");
    }
}

class ExceptionHandlingInMethodsRule4 {
    public static void main(String[] args) {
        try {
            Child4 c = new Child4();
            c.display();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
