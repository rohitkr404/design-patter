package adapter;

public interface BankAPIAdapter {

    public double checkBalance(String accountNumber);
    public boolean payment(String fromAccount, String toAccount, Double amount);
}
