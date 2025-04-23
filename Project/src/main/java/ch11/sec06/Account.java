package ch11.sec06;

public class Account {
    private long balance;

    public Account() {

    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(int money) throws InsufficientException {
        if(balance < money) {
            throw new InsufficientException("잔고 부족: "+(money-balance)+ " 모자람");
        }
        balance -= money;
    }
}
