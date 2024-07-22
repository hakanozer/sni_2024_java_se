package _5_days;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;


public class MainArrayList {
    
    public static void main(String[] args) {
        
        String[] arr = {"Ali", "Veli", "Zehra"};
        // ArrayList
        ArrayList<String> users = new ArrayList<>();

        String name = "Ali";
        // Add item
        users.add(name);
        users.add("Veli");
        users.add("Zehra");
        users.add("Hasan");
        users.add("Mehmet");
        users.add(name);
        users.add("Selin");
        users.add(name);
        users.add(name);
        users.add(name);

        // size
        int size = users.size();
        System.out.println(size);

        // Get item
        System.out.println( users.get(0) );
        int index = 10;

        if (size > index) {
            System.out.println( users.get(index) );
        }
        
        // Remove item
        /*
        String deleteStatus = users.remove(0);
        System.out.println("Delete Status: " + deleteStatus);
        boolean delStatus = users.remove("Hasan");
        System.out.println("Del Status: " + delStatus);
        users.clear();
        */
        //users.removeIf( item -> item.length() > 3 );
        //users.removeIf( item -> item.contains("e") );

        // Contains
        boolean containsStatus = users.contains("Zehra");
        System.out.println(containsStatus);

        // Find Index
        int findIndex = users.indexOf("Zehra");
        System.out.println( "findIndex: " + findIndex);

        // Add index
        users.add(1, "Ahmet");

        // All items
        for (int i = 0; i < users.size(); i++) {
            System.out.println( users.get(i) );
        }
        System.out.println("=====================");

        for (String item : users) {
            System.out.println(item);
        }

        System.out.println("=====================");

        // set
        users.set(2, "Serkan");

        System.out.println(users);
        System.out.println(arr);

        users.set(1, "Alix");
        
        System.out.println(name.hashCode());
        System.out.println("=====================");
        // sort
        Collections.sort(users);
        System.out.println(users);
        System.out.println(users.get(0).hashCode());
        System.out.println(users.get(1).hashCode());
        System.out.println(users.get(2).hashCode());
        System.out.println(users.get(3).hashCode());
        System.out.println(users.get(4).hashCode());
        System.out.println(users.get(5).hashCode());
        Collections.reverse(users);
        System.out.println(users);

        System.out.println("=====================");
        
        // Stream
        Stream<String> lsUser = users
        .stream()
        .filter(item -> item.length() > 3)
        .filter(item -> !item.equals("Alix"));
        lsUser.forEach(item -> {
            System.out.println(item);
        });

        System.out.println("=====================");
        ArrayList<User> ls = new ArrayList<>();

        User u1 = new User();
        u1.setId(100);
        u1.setName("Zehra");
        u1.setEmail("zehra@mail.com");
        u1.setPassword("12345");

        User u2 = new User(101, "Ayşe", "ayse@mail.com", "12345");
        User u3 = new User(102, "Selen", "selen@mail.com", "12345");

        ls.add(u1);
        ls.add(u2);
        ls.add(u3);

        for (User item : ls) {
            System.out.println( item.getId() + " - " + item.getName() + " - " + item.getEmail() );
        }

    }

}
