package Common;


public abstract class AccountControl {
    protected String email;
    protected String password;

    public AccountControl(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public abstract boolean login();
}