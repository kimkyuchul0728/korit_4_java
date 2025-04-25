package ch11_access_modifier;

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    public void deposit(int amount, int inputPin) {
        if (inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if (amount < 0) {
            System.out.println("불가능한 입금 금액입니다.");
            return;
        }
        balance += amount;
        System.out.println("입금 성공! 현재 잔액 : " + balance);
    }

    public void withdraw(int amount, int inputPin) {
        if (inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if (amount < 0) {
            System.out.println("불가능한 입금 금액입니다.");
            return;
        }
        if (balance - amount < 0) {
            System.out.println("잔액 부족! 출금이 불가합니다.");
            return;
        }
        balance -= amount;
        System.out.println("출금 성공! 현재 잔액 : " + balance);
    }

    public void displayInfo() {
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("계좌 번호 : " + accountNum);
        System.out.println("현재 잔액 : " + balance + "\n");
    }
}
