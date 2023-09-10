abstract class ElementsInAbstractClass {
    int x, y;
    static int p, q;
    
    static {
        System.out.println("Static Block!");
    }

    {
        System.out.println("Non-Static Block!");
    }

    void display1() {
        System.out.println("Non-Static Method!");
    }

    static void display2() {
        System.out.println("Static Mathod!");
    }

    abstract void display3();

    public ElementsInAbstractClass() {
        System.out.println("Constructor!");
    }

    final int a = 111;

    final void display4() {
        System.out.println("Final display4!");
    }

    // final abstract void display5();  //Error- Can not create abstract final method
}
