class Teacher {
    void display() {}
}

class JavaTeacher extends Teacher {}

class Demo1 {
    Teacher display() {     //Returning co-varient datatype
        System.out.println("Demo1");
        return null;
    }
}

class Demo2 extends Demo1 {     
    JavaTeacher display() {     //Returning co-varient datatype
        return null;
    }
}

public class MethodOverridingRule3 {
    
}
