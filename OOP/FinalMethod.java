class Demo111 {
    final void display1() {
        System.out.println("display1");
    }

    final void display2() {
        System.out.println("display2");
    }
}

class Demo112 extends Demo111 {
    // void display1() {}      //Error - Can not over-ride final method 
    // void display2() {}
}

public class FinalMethod {
    
}
