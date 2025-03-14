package fintech.model;

/**
 * @author 12S23004 Poppy Sibuea
 * @author 12S23026 Arif Doloksaribu
 */
public class Transaction {

    // class definition
    private Account account;
    private Double amount;
    private String akunm;
    private String postedat;
    private String note;
    private int idlast = 0;
    private int Idnow;

    public Transaction(String akunm,Double amount, String postedat, String note) {
        this.akunm = akunm;
        this.amount = amount;
        this.postedat = postedat;
        this.note = note;
        this.Idnow = idlast;
    }
    
    public String getAkunm(){
        return akunm;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount(){
        return amount;
    }


    public String getPostedat(){
        return postedat;
    }

    public String getNote(){
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    

    public void sumamount(Double amount) {
        if(account.getAccountName().equals(akunm)){
        account.setBalance(account.getBalance() + amount);
    }
}

    @Override
    public String toString() {
        return Idnow  + "|" + akunm + "|" + amount + "|" + postedat + "|" + note;
    }


}