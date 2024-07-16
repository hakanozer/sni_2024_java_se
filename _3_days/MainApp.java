package _3_days;

public class MainApp {

    public static void main(String[] args) {
        
        // Action -> Sınıf Türü
        // ac -> nesne -> Sınıf içinde özellikleri kullanan yapıdır.
        // new -> sınıf içindeki özellikleri bellekte hazır konuma getirir.
        // Action() -> Kurucu method

        // Sınıf içindeki özelliklere (.) nokta operatörü ile ulaşım sağlanır.
        Action ac = new Action();
        System.out.println(ac.num1);

        // no param fnc call
        ac.noReturn();

        // params fnc
        ac.params("İstanbul", 33);
        
        // return fnc
        int size = ac.countSize("Zehra", "Bilmem");
        System.out.println(size);

        boolean status = ac.userLogin("ali01", "12345");
        System.out.println("Login Status: " + status);

        status = ac.userLogin("mehmet01", "12345");
        System.out.println("Login Status: " + status);

        String[] arr = {"Zehra", "Selin", "Sezen", "Ahmet", "Erkan"};
        String names = ac.arrFnc(arr);
        System.out.println(names);

        ac.allParams("Ankara", "İzmir", "İstanbul", "Kastamonu", "Gaziantep");

        Profile profile = new Profile();
        int sm = ac.sum(40, 50, profile);
        System.out.println("Sum: " + sm);


    }

}
