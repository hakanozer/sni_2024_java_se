import java.util.ArrayList;

public class MainIf {
    
    public static void main(String[] args) {
        
        // if
        // karar kontrol yapısıdır.
        /*
         if (şart) {
            şart sağlandığında çalışacak kodlar
         }else {
            şart sağlanmadığında çalışacak kodlar
         }
         */

         int a = 10;
         int b = 11;

         // büyükse
         boolean status = a > b;
         if (status) {
            System.out.println("a > b");
         }else {
            System.out.println("a > b fail");
         }

         // küçükse
         status = a < b;
         System.out.println(status);

         // eşitse
         status = a == b;
         System.out.println(status);

         // eşit değil ise
         status = a != b;
         System.out.println(status);

         // büyük veya eşit
         status = a >= b;
         System.out.println(status);

         // küçük veya eşit
         status = a <= b;
         System.out.println(status);


         System.out.println("===================");
         // else if
         String email = "ali@mail.com";
         String password = "12345";
         String address = "İstanbul / Taksim";

         if (email.equals("")) {
            System.out.println("E-mail Empty!");
         }else if (password.equals("")) {
            System.out.println("Password Empty!");
         }else if (address.equals("")) {
            System.out.println("Address Empty!");
         }else {
            System.out.println("form send");
         }

         // logic operatörleri
         // && -> ve; sol taraf ile sağ taraftaki şartların sağlanması
         // || -> veya; sol taraf yada sağ taraftaki şartlardan herhangi birinin sağlanması
         
         // &&
         status = email.equals("ali@mail.com") && password.equals("12345");
         if (status) {
            System.out.println("User login success");
         }else {
            System.out.println("Email or password fail");
         }

         // ||
         status = a > 10 || b > 10;
         if (status) {
            System.out.println("|| true");
         }else {
            System.out.println("|| false");
         }

         // && ||
         status = a > 10 && b > 11 || a > 9;
         System.out.println(status);

         status = a > 8 || b > 11 && a > 10 && b > 20;
         System.out.println(status);
    }

}
