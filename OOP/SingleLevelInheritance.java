class Protein {
    String item;

    void hasProtein() {
        System.out.println(item+" is Protein Rich Food!");
    }
}

class Egg extends Protein {

}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Egg e = new Egg();
        e.item = "Egg";
        e.hasProtein();
    }
}
