package _2_days;

public class MainFor {

    public static void main(String[] args) {
        
        String[] users = { "Ali", "Mehmet", "Serkan", "Zehra", "Selin", "Kemal" };
        for(int i = 0; i < 5; i++) {
            System.out.println("Ali Bilmem");
        }
        System.out.println("==================");

        for(int i = 2; i < users.length; i++) {
            String data = users[i];
            System.out.println(data);
        }

        System.out.println("==================");

        for(String item : users) {
            System.out.println(item);
        }
        

    }

}
