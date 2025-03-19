package account;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount(100000);

        Runnable deposit = () -> {
            for (int i = 0; i < 10; i++) {
                account.deposit(20000);
                account.wait1S();
            }
        };

        Runnable withdraw = () -> {
            for (int i = 0; i < 10; i++) {
                account.withdraw(15000);
                account.wait1S();
            }
        };

        Thread t1 = new Thread(deposit, "Deposit Thread");
        Thread t2 = new Thread(withdraw, "Withdraw Thread");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Balance: " + account.getBalance());
    }
}
