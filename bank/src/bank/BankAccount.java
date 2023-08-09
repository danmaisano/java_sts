package bank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
	DecimalFormat decimalFormat = new DecimalFormat("0.00");

	private String nameOnAccount;
    private double checkingBalance;
    private double savingsBalance;
    private long accountNumber;
    private static double totalMoney;
    private static int numberOfAccounts = 0;
    private static ArrayList<BankAccount> allAccounts = new ArrayList<>();

    public BankAccount(String nameOnAccount) {
    	this.nameOnAccount = nameOnAccount;
    	this.accountNumber = generateAccountNumber();
    	numberOfAccounts++;
    	allAccounts.add(this);
    }
    
    private long generateAccountNumber() {
    	Random randomNumber = new Random();
   	 	long randomAccountNumber = 1000000000L + (randomNumber.nextLong() % 9000000000L);
   	 	return randomAccountNumber;
    }
    
    public static int accountCount() {
    	return numberOfAccounts;
    }
    
    public static double totalMoney() {
    	
//        double sum = 0;
//        for (BankAccount account : allAccounts) {
//            sum += account.getTotalBalance();
//        }
//        System.out.println("Total balance for all accounts: $" + staticDecimalFormat.format(sum));
    	return totalMoney;
    }
    
    public String getName() {
    	return nameOnAccount;
    }
    
    public double getCheckingBalance() {
    	return this.checkingBalance;
    }
    
    public double getSavingsBalance() {
    	return this.savingsBalance;
    }
    
    public double getTotalBalance() {
    	return (getSavingsBalance() + getCheckingBalance());
    }
    
    public void depositChecking(double depositAmount) {
    	this.checkingBalance += depositAmount;
    	System.out.println("Deposit successful, your new balance is: $" + decimalFormat.format(getCheckingBalance()));
    	totalMoney += depositAmount;
    }
    
    public void depositSavings(double depositAmount) {
    	this.savingsBalance += depositAmount;
    	System.out.println("Desposit successful, your new balance is: $" + decimalFormat.format(getSavingsBalance()));
    	totalMoney += depositAmount;
    }
    
    public void withdrawChecking(double withdrawAmount) {
    	if (getCheckingBalance() > withdrawAmount) {
    		this.checkingBalance -= withdrawAmount;
    		System.out.println("Withdraw successful, your remaining balance is: $" + decimalFormat.format(getCheckingBalance()));
    	} else {
    		System.out.println("Sorry, your checking balance is insufficient to make this withdraw");
    	}
    	totalMoney -= withdrawAmount;
    }
    
    public void withdrawSavings(double withdrawAmount) {
    	if (getSavingsBalance() > withdrawAmount) {
    		this.savingsBalance -= withdrawAmount;
    		System.out.println("Withdraw successful, your remaining balance is: $" + decimalFormat.format(getSavingsBalance()));
    	} else {
    		System.out.println("Sorry, your savings balance is insufficient to make this withdraw");
    	}
    	totalMoney -= withdrawAmount;
    }
    
    public long getAccountNumber() {
    	return this.accountNumber;
    }
    
    public void display() {
    	System.out.println("-- Balance Information for Account: " + getAccountNumber() + " --");
    	System.out.println("Name on account: " + getName());
    	System.out.println("Checking Balance: $" + decimalFormat.format(getCheckingBalance()));
    	System.out.println("Savings Balance: $" + decimalFormat.format(getSavingsBalance()));
    	System.out.println("Total Balance: $" + decimalFormat.format((getSavingsBalance() + getCheckingBalance())));
    }
}
