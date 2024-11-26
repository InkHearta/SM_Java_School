package Java2.lesson2.lesson2_1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

        public double getBalance () {
        return balance;
    }

    public void withdraw(double amount) throws RuntimeException {
        if (amount > balance) {
            throw new RuntimeException("Денег нет.");
        }

        balance -= amount;
    }

    public void deposit(double amount) throws Throwable {
        if (amount < 0) {
            throw new RuntimeException("Отрицательная сумма.");
        }
        else if (amount == 0) {
            throw new RuntimeException("Сумма перевода Ноль.");
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}

