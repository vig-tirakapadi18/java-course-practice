interface Display2 {
    void display();
}

class DisplayClass2 implements Display2 {
    public void display() {
        System.out.println("display of DisplayClass2");
    }

    public void display1() {
        System.out.println("display1 od DisplayClass2");
    }
}

class InterfaceRule5 {
    public static void main(String[] args) {
        Display2 ref;
        DisplayClass2 dc2 = new DisplayClass2();
        ref = dc2;
        ref.display();
        // ref.display1();  //Can not invoke specialized method
        ((DisplayClass2)(ref)).display1();  //Downcasting - Accessing specialized methods
    }
}
