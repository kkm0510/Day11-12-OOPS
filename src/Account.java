public class Account {

    private int balance;

    Account(int balance){
        this.balance=balance;
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int amount){
        balance-=amount;
    }
}
