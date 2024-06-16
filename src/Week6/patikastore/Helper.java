package Week6.patikastore;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Helper {
    static Map<Integer, Product> notebooks = new HashMap<>();
    static Map<Integer, Product> phones = new HashMap<>();

    public static Map<Integer, Product> getNotebooks() {
        return notebooks;
    }

    public static Map<Integer, Product> getPhones() {
        return phones;
    }

    static void initializePhones() {
        Product phone1 = new Phone(Brand.SAMSUNG, "SAMSUNG GALAXY A51", 20000);
        phones.put(Phone.getId(), phone1);
        Product phone2 = new Phone(Brand.APPLE, "iPhone 11 64 GB", 30000);
        phones.put(Phone.getId(), phone2);
        Product phone3 = new Phone(Brand.XIAOMI, "Redmi Note Pro 8GB", 10000);
        phones.put(Phone.getId(), phone3);
    }

    static void initializeNotebooks() {

        Product notebook1 = new NoteBook(Brand.HUAWEI, "HUAWEI Matebook 14", 300);
        notebooks.put(NoteBook.getId(), notebook1);
        Product notebook2 = new NoteBook(Brand.LENOVO, "LENOVO V14 IGL", 400);
        notebooks.put(NoteBook.getId(), notebook2);
        Product notebook3 = new NoteBook(Brand.ASUS, "ASUS Tuf Gaming", 500);
        notebooks.put(NoteBook.getId(), notebook3);
    }

    public static void inputOperations() {
        //Main menu input operations
        boolean isExit = true;
        boolean isSubMenu = true;
        while (isExit) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Welcome to Patika Store!");
            System.out.print("1-Notebook Operations\n2-Mobile Phone Operation\n3-Show Brands\n0-Exit");
            int input = scn.nextInt();

            switch (input) {
                case 0:
                    System.out.println("See you later...");
                    isExit = false;
                    break;
                    //Show menu for notebook operations
                case 1:
                    while(isSubMenu){
                        System.out.println("Welcome to notebook operations!");
                        System.out.println("1-Show notebooks\n2-Add notebook\n3-Delete notebook\n4-Filter By ID\n5-Filter By Brand\n0-Main Menu");
                        int choice = scn.nextInt();
                        //List notebooks
                        if (choice == 1) {
                            System.out.println("***NOTEBOOK LIST***");
                            Product.listProducts(Helper.getNotebooks());
                        }
                        //Add product
                        else if (choice == 2) {
                            System.out.println("Select the product brand:");
                            scn.nextLine();
                            String brand = scn.nextLine();
                            System.out.println("Enter the product price");
                            int price = scn.nextInt();
                            System.out.println("Enter the product name");
                            scn.nextLine();
                            String name = scn.nextLine();
                            try{
                                Product.addProduct(Helper.getNotebooks(), new NoteBook(Brand.valueOf(brand), name, price),NoteBook.getId());
                            }catch(Exception e){
                                System.out.println("This brand is not included in this store.");
                            }
                        }
                        //Delete product
                        else if (choice == 3) {
                            System.out.println("Enter the product id you want to delete.");
                            int productId = scn.nextInt();
                            if (Product.removeProduct(Helper.getNotebooks(), productId)) {
                                System.out.println("Product is removed");
                                System.out.println("Here is the updated version of the products list");
                                Product.listProducts(Helper.getNotebooks());
                            } else {
                                System.out.println("There is no product with ID-> " + productId);
                            }
                        }
                        //Filter By Id
                        else if (choice == 4) {
                            System.out.println("Enter the product id you want to display:");
                            int productID = scn.nextInt();
                            Product.filterById(Helper.getNotebooks(), productID);
                        }
                        //Filter by Brand
                        else if (choice == 5) {
                            System.out.println("Enter the product brand you want to display:");
                            scn.nextLine();
                            String brand = scn.nextLine().toUpperCase();
                            try{
                                Product.filterByBrand(Helper.getNotebooks(), Brand.valueOf(brand));
                            }catch (Exception e){
                                System.out.println("No product with this brand.");
                            }
                        }
                        //If user selects 0 from the submenu, return  to main menu
                        else if(choice==0){
                            isSubMenu=false;
                        }
                    }
                    break;

                //Show menu for mobile phones
                case 2:
                    while(isSubMenu){
                        System.out.println("Welcome to mobile phone operations!");
                        System.out.println("1-Show phones\n2-Add phones\n3-Delete phones\n4-Filter By ID\n5-Filter By Brand\n0-Main Menu");
                        int choicePhone = scn.nextInt();

                        if (choicePhone == 1) {
                            System.out.println("***PHONE LIST***");
                            Product.listProducts(Helper.getPhones());
                        }
                        else if (choicePhone == 2) {
                            System.out.println("Select the product brand:");
                            scn.nextLine();
                            String brand = scn.nextLine();
                            System.out.println("Enter the product price");
                            int price = scn.nextInt();
                            System.out.println("Enter the product name");
                            scn.nextLine();
                            String name = scn.nextLine();
                            try{
                                Product.addProduct(Helper.getPhones(), new NoteBook(Brand.valueOf(brand), name, price),NoteBook.getId());
                            }catch(Exception e){
                                System.out.println("This brand is not included in this store.");
                            }                        }
                        else if (choicePhone == 3) {
                            System.out.println("Enter the product id you want to delete.");
                            int productId = scn.nextInt();
                            if (Product.removeProduct(Helper.getPhones(), Phone.getId())) {
                                System.out.println("Product is removed");
                                System.out.println("Here is the updated version of the products list");
                                Product.listProducts(Helper.getPhones());
                            } else {
                                System.out.println("There is no product with ID-> " + productId);
                            }
                        }
                        else if (choicePhone == 4) {
                            System.out.println("Enter the product id you want to display:");
                            int productID = scn.nextInt();
                            Product.filterById(Helper.getPhones(), productID);
                        }
                        else if (choicePhone == 5) {
                            System.out.println("Enter the product brand you want to display:");
                            scn.nextLine();
                            String brand = scn.nextLine();
                            try{
                                Product.filterByBrand(Helper.getPhones(), Brand.valueOf(brand));
                            }catch (Exception e){
                                System.out.println("No product with this brand.");
                            }
                        }
                        //If user selects 0 from the submenu, return  to main menu
                        else if(choicePhone==0){
                            isSubMenu=false;
                        }
                    }
                    break;
                //List brands by ascending order.
                case 3:
                    Brand.sortByName();
                    break;
            }
        }
    }
    //prints the table header for output
    public static void printTableHeader(){
        System.out.println("-------------------------------------------------");
        System.out.format("| %-2s | %-20s | %-10s | %-2s |" ,"ID","Product Name", "Brand","Price");
        System.out.println();
        System.out.println("-------------------------------------------------");

    }
}
