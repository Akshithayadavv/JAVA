import javax.security.auth.login.AccountException;

public class SolidEx1 {
    public static void main(String args[])
    {
        AccountService service= new AccountService();
        service.openAccount();
    }
}
