/*
13. Design a class named Account that contains: 
I. A private int data field named id for the account (default 0). 
II. A private double data field named balance for the account (default 0). 
III. A private double data field named annualInterestRate that stores the cur-rent interest rate (default 0). Assume all accounts have the same interest rate. 
IV. A private Date data field named dateCreated that stores the date when the account was created. 
V. A no-arg constructor that creates a default account. 
VI. A constructor that creates an account with the specified id and initial balance. 
VII. The accessor and mutator methods for id,balance, and annualInterestRate. 
VIII. The accessor method for dateCreated. 
IX. A method named getMonthlyInterestRate() that returns the monthly interest rate. 
X. A method named getMonthlyInterest() that returns the monthly interest. 
XI. A method named withdraw that withdraws a specified amount from the account. 
XII. A method named deposit that deposits a specified amount to the account. 
*/
// Author : Abhishek Sharma


class Account { 
   private int id = 0;
   private double balance = 0.0;
   private static double annualInterestRate = 0.0; 
   private java.util.Date dateCreated;
   public Account() {
      dateCreated = new java.util.Date();
   }
   public Account(int id, double balace) { 
      this();
      this.id = id; 
      this.balance = balance;
   }
   public int getId() { 
      return this.id;
   }
   public double getBalance() { 
      return this.balance;
   }
   public double getAnnualInterestRate() { 
      return annualInterestRate;
   }
   public String getDateCreated() { 
      return this.dateCreated.toString();
   }
   public void setId(int id) { 
      this.id = id;
   }
   public void setBalance(double balance) { 
      this.balance = balance;
   }
   public void setAnnualInterestRate(double annualInterestRate) { 
      this.annualInterestRate = annualInterestRate;
   }
   public double getMonthlyInterestRate() { 
      return (annualInterestRate / 100) / 12 ;
   }
   public double getMonthlyInterest() {
      return balance * getMonthlyInterestRate();
   }
   public void withdraw(double amount) { 
      this.balance -= amount;
   }
   public void deposit(double amount) { 
      this.balance += amount;
   }
}
public class q13 {
   public static void main(String[] args) {
      Account account = new Account(1122, 20000); 
      account.setAnnualInterestRate(4.5); 
      account.withdraw(2500.0); 
      account.deposit(3000.0);
      System.out.println("Balance: $" + account.getBalance()); 
      System.out.println("Monthly Interest: " + account.getMonthlyInterest()); 
      System.out.println("Date Created: " + account.getDateCreated());
   }
}


/*
Output :
Balance: $500.0
Monthly Interest: 1.875
Date Created: Wed Mar 17 20:07:53 IST 2021
*/
