package adapter;

import adapter.ThirdParty.icicibank.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter {
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public double checkBalance(String accountNumber) {
        String balance = iciciBankAPI.getBalance();
        Double doubleBalance = Double.parseDouble(balance);
        return doubleBalance;
    }

    @Override
    public boolean payment(String fromAccount, String toAccount, Double amount) {
        return false;
    }
}
