public class MainTypeCasting {

    public static void main(String[] args) {
        
        // String to Int
        String stInt = "50";
        int cInt = Integer.parseInt(stInt);
        int numEnd = cInt + 10;
        System.out.println(numEnd);


        // String to double
        String stDouble = "60.8";
        double cDouble = Double.parseDouble(stDouble);
        double doubleEnd = cDouble + 10;
        System.out.println(doubleEnd);

        // int, float, double... to String
        int num1 = 40;
        float f1 = 40.5f;
        String stNum1 = ""+num1;
        String stNum2 = String.valueOf(num1);
        String stFloString = String.valueOf(f1);
        System.out.println(stNum1);
        System.out.println(stNum2);
        System.out.println(stFloString);

    }
    
}
