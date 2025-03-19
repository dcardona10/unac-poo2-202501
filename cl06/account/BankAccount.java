package account;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount);
            } else {
                System.out.println(Thread.currentThread().getName() + " attempted to withdraw " + amount + ", but balance is not enough.");
            }
        } finally {
            lock.unlock();
        }
    }

    public void wait1S() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public double getBalance() {
        return balance;
    }
}
