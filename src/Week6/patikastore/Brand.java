package Week6.patikastore;

import java.util.*;

public enum Brand {
    SAMSUNG,
    LENOVO,
    APPLE,
    HUAWEI,
    CASPER,
    ASUS,
    HP,
    XIAOMI,
    MONSTER;

    //Sort the brands according to the names
    public static void sortByName(){
        List<Brand> brands = new ArrayList<>();
        Collections.addAll(brands,Brand.values());
        Collections.sort(brands,(brand1,brand2)->brand1.toString().compareTo(brand2.name()));

        for(Brand brand : brands){
            System.out.println(brand.toString());
        }
    }
}
