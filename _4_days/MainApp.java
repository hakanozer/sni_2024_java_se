package _4_days;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        // Scanner Class
        Scanner scanner = new Scanner(System.in);
        
        Security security = new Security("mehmet01");
        System.out.println(security.userNameControl());

    }

}
