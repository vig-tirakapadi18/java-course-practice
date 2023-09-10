interface MyCalculator {
    void add();
}

class Calc implements MyCalculator {
    public void add() {
        int x = 23;
        int y = 24;
        int sum;
        sum = x + y;
        System.out.println(sum);
    }
}

class InterfaceRule1 {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add();
    }
}
