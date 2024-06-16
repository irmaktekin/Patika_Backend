package Week6.patikastore;

public class Phone extends Product {
    private static int id=0;

    public Phone(Brand brand, String name, int price) {
        super(brand,name,price);
        id++;

    }
    public static int getId() {
        return id;
    }
}
