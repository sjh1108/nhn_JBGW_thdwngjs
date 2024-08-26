public class BankAccount {
    private int accountNo;
    private String ownerName;

    public int getAccountNo(){
        return this.accountNo;
    }

    public BankAccount setAccount(int accountNo){
        this.accountNo = accountNo;

        return this;
    }
}

class Test{
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.setAccount(1);
        System.out.println(account.getAccountNo());
    }

}

