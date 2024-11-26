package Java2.lesson2.lesson2_1;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12480", 600.0);
        BankAccount account2 = new BankAccount("69001", 300.0);

        BankService bankService = new BankService();

        // Успешный перевод
        bankService.transferFunds(account1, account2, 600);

        // Отклоненный перевод
        bankService.transferFunds(account1, account2, 0);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}

