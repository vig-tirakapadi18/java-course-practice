class Exercise {
    void exercise() {
        System.out.println("Exercising!");
    }
}

class SingleHandPushUps extends Exercise {
    void hardLevel() {
        System.out.println("Doing Single Hand PushUps!");
    }
}

class PushUpsWithClaps extends Exercise {
    void mediumLevel() {
        System.out.println("Doing PushUps with Claps!");
    }
}

class NormalPushUps extends Exercise {
    void easyLevel() {
        System.out.println("Doing Normal PushUps!");
    }
}

public class HirarchicalInheritance {
    public static void main(String[] args) {
        SingleHandPushUps s = new SingleHandPushUps();
        PushUpsWithClaps c = new PushUpsWithClaps();
        NormalPushUps n = new NormalPushUps();

        s.exercise();
        s.hardLevel();

        c.exercise();
        c.mediumLevel();

        n.exercise();
        n.easyLevel();
    }
}
