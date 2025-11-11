package ATM;
import java.util.Scanner;

public class atm {

      private double balance;

    // Constructor
    public atm() {
        this.balance = 1000.0;
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
    public void checkbalances()
    {
        System.out.println("balances = " + balance);
    }
    public void addmoney(double money)
    {
        if(money <=0)
        {
            System.out.println("can not add money");
        }
        else {
            balance+=money;
            checkbalances();
        }
    }
    public void withdraw(double C)
    {
        if(C <=0)
        {
            System.out.println("cannot withferaw money");
        }
        else {
            balance-=C;
            checkbalances();
        }
    }

    // Deposit money
//    public void deposit(double amount) {
//        if (amount <= 0) {
//            System.out.println("Deposit amount must be greater than zero!");
//        } else {
//            balance += amount;
//            System.out.println("₹" + amount + " deposited successfully!");
//            checkBalance();
//        }
//    }
//
//    // Withdraw money
//    public void withdraw(double amount) {
//        if (amount <= 0) {
//            System.out.println("Invalid amount!");
//        } else if (amount > balance) {
//            System.out.println("Insufficient balance!");
//        } else {
//            balance -= amount;
//            System.out.println("₹" + amount + " withdrawn successfully!");
//            checkBalance();
//        }
//    }
}



