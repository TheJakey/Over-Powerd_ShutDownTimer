package login;

/**
 * User Class stores user data.
 * Implements Singleton
 */
public class User {
    private static User currentUser;
    private String username;
    private String password;

    private User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User getInstance() {
        return currentUser;
    }

    public User getInstance(String username, String password) {
        if (currentUser == null)
            currentUser = new User(username, password);

        return currentUser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
