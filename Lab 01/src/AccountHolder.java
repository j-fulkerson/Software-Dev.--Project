//Programmed By: Joe Fulkerson

import java.util.Scanner;
public class AccountHolder {
	
	Scanner sc =new Scanner (System.in);
	
	//assign variables 
	
	private double annualInterestRate = (.04);
	private double balance;
	
	
	//AccountHolder Constructor
	AccountHolder(double acctBal){
		balance = acctBal;
	}
	
	//Deposit method and deposit inputs
	
	public void Deposit() {
		System.out.println("*****ENTER DEPOSIT AMOUNT*****" + "");
		double depAmount = sc.nextDouble();
		
		
		//error statement for no deposit amount
		if(depAmount > 0) {
			System.out.println("DEPOSIT AMOUNT $" + depAmount);
			balance = depAmount + balance;
			System.out.println("BALANCE $" + balance );
		}
		else{
			System.err.println("*****INVALID ENTRY*****");
			System.err.println("*****PLEASE ENTER AMOUNT*****");
			
		}
}
		
	public void Withdrawal() {
		System.out.println("");
		System.out.println("BALANCE $" + balance);
		System.out.println("*****ENTER WITHDRAWAL AMOUNT*****");
		double withAmount = sc.nextDouble();
		
		//error for withdrawal past AccountBalance of $50
		if (withAmount<=balance) {
			balance = balance - withAmount;
			System.out.println("*********************");
			System.out.println("WITHDRAWAL AMOUNT -$" + withAmount);
			System.out.println("");
			System.out.println("BALANCE $" + balance);
			System.out.println("*********************");
		if(balance < 50) {
			System.err.println("*****INSUFFICIENT FUNDS!*****");
			System.err.println("*****ACCOUNT BALANCE MUST BE ABOVE $50*****");
			System.out.println("");
			System.err.println("*******************************************");
			balance = balance + withAmount;
			System.out.println("BALANCE $" + balance);
		}else{
			System.out.println("");
			}
		}
		
  
}

		//interest accrued for one month based on 4% annual rate.
	public void monthlyInterest(double monthlyInterest) {
		monthlyInterest = balance * (annualInterestRate/12);
		double monthlyBal = balance + monthlyInterest; 
		System.out.println("*********************");
		System.out.println("BALANCE $" + balance);
		System.out.println("MONTHLY INTEREST $" + monthlyInterest + "");
		System.out.println("BALANCE WITH INTEREST $" + monthlyBal);
		System.out.println("*********************");
	} 
	
	public double getBal() {
		return balance;
	}
	
}
