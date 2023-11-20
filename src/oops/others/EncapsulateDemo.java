package src.oops.others;

class User {
    private String userName, password;

    public User(String userName, String password) {
        this.userName = userName.toLowerCase();
        this.password = password.toLowerCase();
    }
    public String login(String userName, String password) {
        if (this.userName.equals(userName.toLowerCase()) &&
            this.password.equals(password.toLowerCase())) {
            return "User can login";
        }
        else {
            return "Invalid credentials";
        }

    }
}
public class EncapsulateDemo {
    public static void main(String[] args) {
        User a = new User("dummyname", "dummypwd");
        System.out.println(a.login("name", "pwd"));

        User b = new User("name", "pwd");
        System.out.println(b.login("name", "pwd"));


    }
}
