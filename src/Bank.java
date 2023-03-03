public class Bank {
    private volatile int account;
    public void inc(){
        account+=2;
    }
    public void dec(){
        account--;
    }

    public Bank(){
        account = 1;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
