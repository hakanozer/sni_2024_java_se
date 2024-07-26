package _8_days;

public interface IProfile {
    String profileName(int userID);
    String profileImagePath(int userID);
    boolean profileLogout(int userID);
}
