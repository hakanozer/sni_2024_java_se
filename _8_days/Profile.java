package _8_days;

public class Profile implements IProfile {

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
    
}
