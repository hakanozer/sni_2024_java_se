package _8_days;


public class MainInterface {
    public static void main(String[] args) {
        
        Profile profile = new Profile();
        Customer customer = new Customer();
        IUser userProfile = new Profile();
        
        action(userProfile, "ali01", "12345");
        action(profile, "veli01", "12345");
        action(customer, "serkan01", "12345");

        IProfile profileX = new IProfile() {

            @Override
            public String profileName(int userID) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'profileName'");
            }

            @Override
            public String profileImagePath(int userID) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'profileImagePath'");
            }

            @Override
            public boolean profileLogout(int userID) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'profileLogout'");
            }
            
        };
    }

    public static void action(IUser iUser, String username, String password) {
        iUser.userLogin(username,password);
    }

}
