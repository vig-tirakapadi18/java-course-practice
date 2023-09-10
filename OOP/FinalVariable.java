class Demo113 {
    final int x = 111;

    void display1() {
        System.out.println(x);
    }

    void display2() {
        // x = 222;     //Can not change final variable value
    }
}

class FinalVariable {
    public static void main(String[] args) {
        Demo113 d113 = new Demo113();
        d113.display1();
        d113.display2();
    }
}
