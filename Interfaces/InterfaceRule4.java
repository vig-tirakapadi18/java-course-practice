interface Display1 {
    void display1();
}

class DisplayClass1 implements Display1 {
    public void display1() {
        System.out.println("display1 of DisplayClass1");
    }
}

class InterfaceRule4 {
    public static void main(String[] args) {
        // Display1 d1 = new Display1();    //Can't instantiate interface
        DisplayClass1 dc1 = new DisplayClass1();
        dc1.display1();
    }
}
