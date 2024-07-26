package _8_days;

public class Profile implements IProfile, IUser {

    @Override
    public String profileName(int userID) {
        return "Ali Bilmem";
    }

    @Override
    public String profileImagePath(int userID) {
        return "aliProfile.jpg";
    }

    @Override
    public boolean profileLogout(int userID) {
        return true;
    }

    @Override
    public boolean userLogin(String username, String password) {
        if (username.equals("ali01") && password.equals("12345")) {
            return true;
        }
        return false;
    }
    
}
