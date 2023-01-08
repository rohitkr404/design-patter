package adapter;

import adapter.ThirdParty.icicibank.YESBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YESBankAPI yesBankAPI = new YESBankAPI();
    @Override
    public double checkBalance(String accountNumber) {
//        String balance = yesBankAPI.getBalance();
//        Double doubleBalance = Double.parseDouble(balance);
//        return doubleBalance;
        return 0;
    }

    @Override
    public boolean payment(String fromAccount, String toAccount, Double amount) {
        return false;
    }
}
