package pl.sda.ModyfikatoryDostepu.ZadanieBank;

public class Bank implements BankTransfer {

    public final int BANK_FEE = 1;

    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        if (from.balance < amount + BANK_FEE) {
            throw new IllegalStateException("Niewystarczająca ilość środków!");
        }
        from.withdraw(amount + BANK_FEE);
        to.deposit(amount);
    }

    public BankAccount openAccount() {
        return new BankAccount();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount account1 = bank.openAccount();
        BankAccount account2 = bank.openAccount();

        account1.deposit(100);
        account2.deposit(50);

        bank.transfer(account1, account2, 65);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
