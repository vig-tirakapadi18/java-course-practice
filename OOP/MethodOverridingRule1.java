class Demo1 {
    protected void display() {
        System.out.println("Demo1");
    }
}

class Demo2 extends Demo1 {     //Same visibility Access Modifier
    protected void display() {
        System.out.println("Demo2");
    }
}

class Demo3 extends Demo1 {     //Increased Visibility Access Modifier
    public void display() {
        System.out.println("Demo3");
    }
}

class Demo4 extends Demo1 {
    // void display() {        //Decreased Visibility - Not allowed
    //     System.out.println("Demo4");
    // }
}

public class MethodOverridingRule1 {
    
}
