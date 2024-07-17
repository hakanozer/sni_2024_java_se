package _4_days;

public class Security {
    
    String username = "ali01";

    // kurucu methdolar
    // Normal method gibidirler
    // sınıf adi ile aynı isimde olmak zorundadırlar
    // void yada return anahtar kelimesi alamazlar
    public Security() {
        System.out.println("Empty Security Call");
    }

    public Security(String username) {
        this.username = username;
    }

    public boolean userNameControl() {
        return findUserName(username);
    }

    private boolean findUserName(String name) {
        String[] users = {"ali01", "erkan01", "serkan34", "mehmet01", "zehra01"};
        for (String item : users) {
            if (item.equals(name)) {
                return true;
            }
        }
        return false;
    }

}
