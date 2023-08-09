package bank;

import java.text.DecimalFormat;

public class BankTest {
    public static void main(String[] args){
    	DecimalFormat staticDecimalFormat = new DecimalFormat("0.00");
        // Create 3 bank accounts
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
    	
    	BankAccount account1 = new BankAccount("Dan Maisano");
    	BankAccount account2 = new BankAccount("Lana Kane");
    	BankAccount account3 = new BankAccount("Sterling Archer");
    	
    	account1.display();
    	account2.display();
    	account3.display();
    	
    	account1.depositChecking(50000);
    	account2.depositChecking(20000);
    	account3.depositChecking(10000);
    	account2.depositSavings(10000);
    	account1.depositSavings(20000);
    	
    	account1.display();
    	account2.display();
    	account3.display();
    	
    	System.out.println("Total balance for all accounts is $" + staticDecimalFormat.format(BankAccount.totalMoney()));
    }
}
