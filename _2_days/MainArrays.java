package _2_days;

public class MainArrays {

    public static void main(String[] args) {
        
        // Diziler
        // çağul dataları bir özellik altında toplama biçimidir.

        String[] users = { "Ali", "Mehmet", "Serkan", "Zehra", "Selin" };
        
        // index
        // 0 dan başlar
        System.out.println( users[0] );
        System.out.println( users[1] );
        System.out.println( users[4] );
        

        int count = users.length;
        System.out.println(count);

        int[] invoces = { 100, 150, 200, 201 };
        System.out.println(invoces[0]);

        // object array
        Object[] objects = { "Mehmet", "Bil", 30, true, 25.6 };
        System.out.println(objects[0]);

    }
    
}
