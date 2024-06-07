package Week6.patikastore;

import java.util.*;

public class PatikaStore {
  //  static ArrayList <Product> notebooks= new ArrayList<>();
    static Map <Integer,Product> notebooks = new HashMap<>();
    static Map <Integer,Product> phones= new HashMap<>();

    public static void main(String[] args) {
        initializeNotebooks();
        initalizePhones();

        //Main menu input operations
        while(true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Welcome to Patika Store!");
            System.out.print("1-Notebook Operations\n2-Mobile Phone Operation\n3-Show Brands\n0-Exit");
            int input = scn.nextInt();


            switch (input) {
                case 0:
                    System.out.println("See you later...");
                    break;
                case 1:
                    System.out.println("Welcome to notebook operations!");
                    System.out.println("1-Show notebooks\n2-Add notebook\n3-Delete notebook\n4-Filter By ID\n5-Filter By Brand");
                    int choice = scn.nextInt();

                    if (choice == 1) {
                        Product.listProducts(notebooks);
                        break;
                    } else if (choice == 3) {
                        System.out.println("Enter the product id you want to delete.");
                        int productId = scn.nextInt();
                        if (Product.removeProduct(notebooks, productId)) {
                            System.out.println("Product is removed");
                            System.out.println("Here is the updated version of the products list");
                            Product.listProducts(notebooks);
                        } else {
                            System.out.println("There is no product with ID-> " + productId);
                        }

                    } else if (choice == 2) {
                        System.out.println("Select the product brand:");
                        scn.nextLine();
                        String brand = scn.nextLine();
                        System.out.println("Enter the product id");
                        int id = scn.nextInt();
                        System.out.println("Enter the product price");
                        int price = scn.nextInt();
                        System.out.println("Enter the product name");
                        scn.nextLine();
                        String name = scn.nextLine();
                        Product.addProduct(notebooks, new NoteBook(Brand.valueOf(brand), name, price),id);
                    } else if (choice == 4) {
                        System.out.println("Enter the product id you want to display:");
                        int productID = scn.nextInt();
                        Product.filterById(notebooks, productID);
                    } else if (choice == 5) {
                        System.out.println("Enter the product brand you want to display:");
                        scn.nextLine();
                        String brand = scn.nextLine();
                        Product.filterByBrand(notebooks, Brand.valueOf(brand));
                    }
                    break;
                case 2:
                    System.out.println("Welcome to mobile phone operations!");
                    System.out.println("1-Show phones\n2-Add phones\n3-Delete phones\n4-Filter By ID\n5-Filter By Brand");
                    int choicePhone = scn.nextInt();

                    if (choicePhone == 1) {
                        Product.listProducts(phones);
                    } else if (choicePhone == 3) {
                        System.out.println("Enter the product id you want to delete.");
                        int productId = scn.nextInt();
                        if (Product.removeProduct(phones, productId)) {
                            System.out.println("Product is removed");
                            System.out.println("Here is the updated version of the products list");
                            Product.listProducts(phones);
                        } else {
                            System.out.println("There is no product with ID-> " + productId);
                        }

                    } else if (choicePhone == 2) {
                        System.out.println("Select the product brand:");
                        scn.nextLine();
                        String brand = scn.nextLine();
                        System.out.println("Enter the product id");
                        int id = scn.nextInt();
                        System.out.println("Enter the product price");
                        int price = scn.nextInt();
                        System.out.println("Enter the product name");
                        scn.nextLine();
                        String name = scn.nextLine();
                        Product.addProduct(phones, new NoteBook(Brand.valueOf(brand), name, price), id);
                    } else if (choicePhone == 4) {
                        System.out.println("Enter the product id you want to display:");
                        int productID = scn.nextInt();
                        Product.filterById(phones, productID);
                    } else if (choicePhone == 5) {
                        System.out.println("Enter the product brand you want to display:");
                        scn.nextLine();
                        String brand = scn.nextLine();
                        Product.filterByBrand(phones, Brand.valueOf(brand));
                    }
                    break;
                case 3:
                    Brand.sortByName();
                    break;

            }
        }
    }


    private static void initalizePhones() {
        Product phone1 = new Phone(Brand.HUAWEI,"SAMSUNG GALAXY A51",7000);
        Product phone2 = new Phone(Brand.LENOVO,"iPhone 11 64 GB",8000);
        Product phone3 = new Phone(Brand.ASUS,"Redmi Note 10 Pro 8GB",8000);
        phones.put(1,phone1);
        phones.put(2,phone2);
        phones.put(3,phone3);
    }

    private static void initializeNotebooks() {

        Product notebook1 = new NoteBook(Brand.HUAWEI,"HUAWEI Matebook 14",300);
        Product notebook2 = new NoteBook(Brand.LENOVO,"LENOVO V14 IGL",400);
        Product notebook3 = new NoteBook(Brand.ASUS,"ASUS Tuf Gaming",500);
        notebooks.put(1,notebook1);
        notebooks.put(2,notebook2);
        notebooks.put(3,notebook3);

    }
}
