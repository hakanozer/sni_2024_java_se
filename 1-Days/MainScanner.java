import java.util.Scanner;

public class MainScanner {
    
    public static void main(String[] args) {
        
        // Scanner
        // Kullanıcıdan veri alımı
        Scanner read = new Scanner(System.in);

        System.out.println("Name?");
        String name = read.nextLine();

        System.out.println("Surname?");
        String surname = read.nextLine();

        String nameSurname = "Sn. "+name+ " " +surname;
        System.out.println(nameSurname);

        Scanner readNumber = new Scanner(System.in);

        System.out.println("Number-1");
        double d1 = readNumber.nextDouble();

        System.out.println("Number-2");
        double d2 = readNumber.nextDouble();

        double end = d1 + d2;
        System.out.println(end);

        end = d1 - d2;
        System.out.println(end);

        end = d1 * d2;
        System.out.println(end);

        end = d1 / d2;
        System.out.println(end);
    }

}
