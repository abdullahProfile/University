package Model;

public abstract class User {
    private int userId;
    private String name;
    private String email;
    private String password;
    private String role;

    public User(int userId, String name, String email, String password, String role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Abstract method to be implemented by subclasses (optional, if needed)
    public abstract String getRole();

    // Getter methods
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
