interface Addition {
    void add();
}

interface Subtraction extends Addition {    //An interface can never implement another interface 
                                            //rather it extends another interface
    void sub();
}

class AddSub implements Subtraction {   //If a class is implemented from extended interface, 
                                        //then it must provide body to all the methods
    public void add() {
        System.out.println("add() of AddSub!");
    }

    public void sub() {
        System.out.println("sub() of AddSub!");
    }
}

class InterfaceRule6 {
    public static void main(String[] args) {
        AddSub as = new AddSub();
        as.add();
        as.sub();
    }
}
