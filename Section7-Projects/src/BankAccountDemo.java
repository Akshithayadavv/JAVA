public class BankAccountDemo {
    public static void main(String[] args){
        BankAccount myAccount= new BankAccount("John Baugh",5000);
        BankAccount bobsAccount=new BankAccount("Bob");

        bobsAccount.deposit(500);
        System.out.println("Owner: "+ bobsAccount.getOwner());
        System.out.println("Balance :"+bobsAccount.getBalance());

        bobsAccount.deposit(1000);
        System.out.println("Owner: "+ bobsAccount.getOwner());
        System.out.println("Balance :"+bobsAccount.getBalance());
        System.out.println();


        System.out.println("Owner: "+ myAccount.getOwner());
        System.out.println("Balance :"+myAccount.getBalance());
        System.out.println();

        System.out.println("Deposit 1000");
        myAccount.deposit(1000);
        }
}
