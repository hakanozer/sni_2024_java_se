package _3_days;

import java.io.File;
import java.io.IOException;

public class MainTryCatch {
    public static void main(String[] args) {
        
        try {
            // hata olma olasılığı olan kodlar
            String stAge = "a30";
            int age = Integer.parseInt(stAge);
            int sum = age + 55;
            System.out.println("Sum: " + sum);
        }catch(Exception ex) {
            // Hata olduğunda çalışacak kod bloğu
            System.out.println(ex.getMessage());
            System.out.println("Lütfen sayısal değerler giriniz!");
        }finally {
            // her durumda çalışacak kod parçası
        }
        System.out.println("This line call");

        File file = new File("sample.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Action action = new Action();
        try {
            action.connect("project");
        } catch (Exception e) { }
        

    }
}
