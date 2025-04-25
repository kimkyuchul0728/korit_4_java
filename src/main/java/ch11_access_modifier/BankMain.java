package ch11_access_modifier;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.setAccountNum(123456);
        bank1.setAccountHolder("홍길동");
        bank1.setBalance(100000);
        bank1.setPinNumber(1234);
        Bank bank2 = new Bank();
        bank2.setAccountNum(987654);
        bank2.setAccountHolder("신사임당");
        bank2.setBalance(500000);
        bank2.setPinNumber(5678);
        bank1.displayInfo();
        bank2.displayInfo();
        bank1.deposit(50000, 1234);
        bank1.withdraw(200000,1234);
        bank1.withdraw(100000, 1234);
        System.out.println();
        bank2.withdraw(100000, 5678);
        bank2.deposit(200000, 5678);
        System.out.println();
        bank1.displayInfo();
        bank2.displayInfo();


    }
}