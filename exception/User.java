package exception;

public class User {
    String login;
    String email;
    String password;
    int age;

    public User(String login, String email, String password, int age) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.age = age;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }
}
