package Week6.patikastore;

import java.util.Map;

public abstract class Product{

    protected Brand brand;
    protected String name;
    protected int price;

    public Brand getBrand() {
        return brand;
    }
    public int getPrice() {
        return price;
    }

   public String getName() {
        return name;
    }
   public void setName(String name) {
        this.name = name;
    }

   public Product(Brand brand,String name,int price) {
        this.brand = brand;
        this.name= name;
        this.price = price;
    }

    static void listProducts(Map<Integer,Product> products){
        Helper.printTableHeader();
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.format( "| %-2s | %-20s | %-10s | %-5d |", entry.getKey(), entry.getValue().getName(),entry.getValue().getBrand(),entry.getValue().getPrice());
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
    }
    static boolean removeProduct(Map<Integer,Product> products,Integer id){
        if(products.containsKey(id)){
            products.remove(id);
            return true;
        }
        return false;
    }

    static void addProduct(Map<Integer,Product> products,Product p,Integer id){
        if(products.containsKey(id)) {
            System.out.println("There is already a product with id:" + id);
        }
        else{
            products.put(id,p);
            System.out.println("PRODUCT IS ADDED. Here is the updated product list.");
            listProducts(products);
        }

    }
    static void filterByBrand(Map<Integer,Product> products,Brand brand){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if(entry.getValue().getBrand().toString().equals(brand.toString())){
                System.out.format( " ID-> %s Name-> %s Brand-> %s Price-> %-2d ", entry.getKey(), entry.getValue().getName(),entry.getValue().getBrand(),entry.getValue().getPrice());
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand=" + brand +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    static void filterById(Map<Integer,Product> products, int id){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if(entry.getKey().equals(id)){
                System.out.format( " ID-> %s Name-> %s Brand-> %s Price-> %-2d ", entry.getKey(), entry.getValue().getName(),entry.getValue().getBrand(),entry.getValue().getPrice());
            }
            else{
                System.out.println("No product exist with this ID.");
                break;
            }
        }
        System.out.println();
    }
}

