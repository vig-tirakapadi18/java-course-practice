class Laptop {
    String brand;
    String processor;
    int price;

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

class DefaultConstructor {
    public static void main(String[] args) {
        Laptop l = new Laptop();

        System.out.println(l.getBrand());
        System.out.println(l.getProcessor());
        System.out.println(l.getPrice());
    }
}
