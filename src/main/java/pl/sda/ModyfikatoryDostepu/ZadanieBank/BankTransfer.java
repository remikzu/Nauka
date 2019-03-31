package pl.sda.ModyfikatoryDostepu.ZadanieBank;

public interface BankTransfer {

    void transfer(BankAccount from, BankAccount to, int amount);

}
