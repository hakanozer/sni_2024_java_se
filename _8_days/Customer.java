package _8_days;

public class Customer implements ICustomer {

    @Override
    public boolean userLogin(String username, String password) {
        return  true;
    }

    @Override
    public boolean customerChangePassword(String password, int userID) {
        return true;
    }
    
}
