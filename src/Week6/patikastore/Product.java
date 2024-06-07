package Week6.patikastore;

import java.util.Map;
import java.util.Objects;

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
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Integer key = entry.getKey();
            String name = entry.getValue().getName();
            Brand brand = entry.getValue().getBrand();
            System.out.println("ID: " + key + ", Name: " + name + " Brand:" + brand +" Price:"+entry.getValue().getPrice());
        }
    }
    static boolean removeProduct(Map<Integer,Product> products,Integer id){
    if(products.containsKey(id)) {
        System.out.println("There is already a product with id:" + id);
        return false;
    }
    products.remove(id);
        return true;
    }

    static void addProduct(Map<Integer,Product> products,Product p,Integer id){
            products.put(id,p);
            System.out.println("PRODUCT IS ADDED_>" +p.toString());
    }
    static void filterByBrand(Map<Integer,Product> products,Brand brand){

        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if(entry.getValue().getBrand().equals(brand)){
                System.out.println("ID: "+ entry.getKey()+"Name:"+ entry.getValue().getName()+"Brand: "+entry.getValue().getName());
            }
        }
    }
    static void filterById(Map<Integer,Product> products,Integer id){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if(Objects.equals(entry.getKey(), id)){
                System.out.println("ID: "+ entry.getKey()+"Name:"+ entry.getValue().getName()+"Brand: "+entry.getValue().getName());
            }
        }
    }

}

