package _8_days;

public interface ICustomer extends IUser {
    boolean customerChangePassword(String password, int userID);
}
