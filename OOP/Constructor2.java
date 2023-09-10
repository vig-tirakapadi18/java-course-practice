class Laptop2 {
    String brand;
    String processor;
    int price;

    public Laptop2(String brand, String processor, int price) {
        this.brand = brand;
        this.processor = processor;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getPrice() {
        return price;
    }
}

public class Constructor2 {
    public static void main(String[] args) {

        // Laptop2 l = new Laptop2(); //Error- We must provide parameters
        Laptop2 l = new Laptop2("HP", "i5", 420000);

        System.out.println(l.getBrand());
        System.out.println(l.getProcessor());
        System.out.println(l.getPrice());
    }
}
