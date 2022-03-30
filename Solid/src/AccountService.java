public class AccountService {

    public AccountRepository repository = new AccountRepository();
    public NotificationService notificationservice= new NotificationService();

    public void openAccount()
    {
        System.out.println("Fill account internal details");
        repository.create();
        notificationservice.sendnotification();
    }


}
