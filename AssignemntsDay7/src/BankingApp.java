class BankAccount{
    String accountNumber;
    private double accountBalance;
    String accountHolderName;
    private String accountHolderPhoneNumber;
    private String accountHolderEmailId;

    public BankAccount(String accountNumber, double accountBalance, String accountHolderName, String accountHolderPhoneNumber, String accountHolderEmailId) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.accountHolderPhoneNumber = accountHolderPhoneNumber;
        this.accountHolderEmailId = accountHolderEmailId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountHolderPhoneNumber() {
        return accountHolderPhoneNumber;
    }

    public void setAccountHolderPhoneNumber(String accountHolderPhoneNumber) {
        this.accountHolderPhoneNumber = accountHolderPhoneNumber;
    }

    public String getAccountHolderEmailId() {
        return accountHolderEmailId;
    }

    public void setAccountHolderEmailId(String accountHolderEmailId) {
        this.accountHolderEmailId = accountHolderEmailId;
        System.out.println();

    }
}



public class BankingApp {
    public static void main(String[] args){


    }
}
