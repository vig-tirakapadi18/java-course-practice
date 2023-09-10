class Robot {
    String processor;
    String name;

    void meeting() {
        System.out.println("Attending meeting!");
    }
}

class TechRobot extends Robot {
    String subject;

    void teach() {
        System.out.println("TechRobot is teaching!");
    }
}

class CleanerRobot extends Robot {
    String item;

    void clean() {
        System.out.println("CleanerRobot is cleaning!");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        TechRobot tr = new TechRobot();
        CleanerRobot cr = new CleanerRobot();

        tr.name = "ABC";
        tr.processor = "i2";
        tr.subject = "JAVA";
        tr.meeting();
        tr.teach();

        cr.item = "Broom";
        cr.name = "XYZ";
        cr.processor = "i5";
        cr.clean();
        cr.meeting();
    }
}
