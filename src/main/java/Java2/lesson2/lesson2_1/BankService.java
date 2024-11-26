package Java2.lesson2.lesson2_1;

public class BankService {
        public void transferFunds(BankAccount fromAccount, BankAccount toAccount, double amount) {
            try {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Успешно переведено: " + amount + " рублей со счета " + fromAccount + " на счет " + toAccount);
            } catch (Throwable e) {
                System.out.println("Ошибка!!!" +e.getMessage());
                e.printStackTrace();
            }
        }
    }