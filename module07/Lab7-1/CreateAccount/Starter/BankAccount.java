import java.math.*;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;

    private static long nextAccountNumber;

    public static long nextNumber(){
        return nextAccountNumber++;
    }

    //
    // add setData method here.
    //

    public void setData(long accountNumber, String ownerName, BigDecimal balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //
    // add getNumber method here.
    //

    public long getNumber(){
        return this.accountNumber;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public BigDecimal getBalance(){
        return this.balance;
    }
}

class CreateAccount {
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        
        // newAccount.accountNumber = accountNumber;
        // newAccount.ownerName = ownerName;
        // newAccount.balance = balance;

        long accountNumber = BankAccount.nextNumber();
        newAccount.setData(accountNumber, ownerName, balance);

        return newAccount;
    }

    public static void main(String[] args) {
       BankAccount bankAccount = CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("0.0"));
       printBankAccount(bankAccount);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}