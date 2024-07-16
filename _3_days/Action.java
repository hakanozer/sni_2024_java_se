package _3_days;

public class Action {

    int num1 = 100;
    String stName = "Mehmet";

    // no return fnc
    public void noReturn() {
        String surname = "Bilmem";
        System.out.println("noReturn Call");
    }

    // params fnc
    public void params(String data, int num1) {
        int sum = data.length() + num1;
        System.out.println("Sum Char: " + sum);
    }

    // return fnc
    public int countSize(String name, String surname) {
        int size = name.length() + surname.length();
        return size;
    }

    public boolean userLogin(String username, String password) {
        boolean status = false;
        if( username.equals("ali01") && password.equals("12345")) {
            status = true;
        }
        if (status) {

        }
        return status;
    }

    public String arrFnc( String[] dataArr ) {
        String stData = "";
        for (String item : dataArr) {
            stData += item + "-"; 
        }
        return stData;
    }


    public void allParams(String... arrs) {
        for (String item : arrs) {
            System.out.println(item);
        }
    }

    /**
     * Sum Function Detail
     * @Author ali@mail.com
     * @param num1 - User number
     * @param num2 - Customer number
     * @param profile - Profile Object
     * @return - int
     * @since 1.8
     */
    public int sum( int num1, int num2, Profile profile ) {
        int sm = num1 + num2 + profile.call();
        return sm;
    }

    public void connect(String dbName) throws Exception  {
        System.out.println(dbName);
    }

}
