public class BankAccount {

    private String name, pinCode;
    private UsaDollar currency = new UsaDollar();

    public BankAccount(String name, String pinCode, UsaDollar currency) {
        this.name = name;
        this.pinCode = pinCode;
        this.currency = currency;
    }

    public void deposit(int amountCash) {
        if (amountCash > 0) {
            
        }
    }
}
