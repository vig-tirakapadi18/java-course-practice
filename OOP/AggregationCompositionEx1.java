class OS {
    String name;

    public OS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Charger {
    String brand;

    public Charger(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Mobile {
    OS os = new OS("Android");

    void hasA(Charger ref) {
        System.out.println(ref.brand);
    }
}

public class AggregationCompositionEx1 {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        Charger ch = new Charger("MI");
        m.os.getName();
        m.hasA(ch);

        m = null;
        // m.os.getName();
        // ch.getBrand();
    }
}
