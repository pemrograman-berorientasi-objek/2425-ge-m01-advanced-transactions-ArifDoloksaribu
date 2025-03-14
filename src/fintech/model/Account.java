package fintech.model;

/**
 * @author 12S23004 Poppy Sibuea
 * @author 12S23026 Arif Doloksaribu
 */
public class Account {

    private String owner;
    private String accountname;
    private Double balance = 0.0;

    public Account(String owner, String accountname) {
        this.owner = owner;
        this.accountname = accountname;
    }

    public String getOwner(){
        return owner;
    }

    public String getAccountName(){
        return accountname;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return accountname + "|" + owner + "|" + balance;
    }

}