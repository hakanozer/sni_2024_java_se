package _6_days;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainLinkedSet {
    public static void main(String[] args) {
        
        Set<String> set = new LinkedHashSet<>();

        set.add("Ali");
        set.add("Ali");
        set.add("Ali");
        set.add("Ali");
        set.add("Mehmet");
        set.add("Serkan");
        set.add("Serkan");
        set.add("Serkan");
        set.add("Ahmet");

        System.out.println(set);


        Set<Product> products = new LinkedHashSet<>();

        Product p1 = new Product(1, "TV");
        Product p2 = new Product(2, "iPhone");
        Product p3 = new Product(3, "Samsung");
        Product p4 = new Product(3, "Samsung");

        products.add(p1);
        products.add(p1);
        products.add(p2);
        products.add(p2);
        products.add(p2);
        products.add(p3);
        products.add(p3);
        products.add(p4);
        products.add(p4);
        products.add(p4);

        System.out.println(products);

    }
}
