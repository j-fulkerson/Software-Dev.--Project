//Programmed By: joe Fulkerson


import java.util.Scanner;
import java.util.*;

public class AccountHolderTest {

		public static void main(String[] args) {	
		
		// TODO Auto-generated method stub

			double sBal = 0;
			int menu;
			
			Date d = new Date();
			
			
			//bank account introduction and header
			System.out.println("Programmed By: Joe Fulkerson");
			System.out.println("");
			System.out.println("-*-*-*-*-*BANK ACCOUNT*-*-*-*-*-");
			System.out.println("");
			
			//Account user name,date and welcome of user
			final Scanner sc = new Scanner(System.in);
			
			System.out.println("ENTER ACCOUNT NAME: ");
			
			final String AccountHolder = sc.nextLine();
			
			//display account holder name and date
			System.out.println("************* WELCOME ***************");
			System.out.println("");
			System.out.println("ACCOUNT HOLDER NAME:" + AccountHolder);
			System.out.println("DATE " + d.toString());
			System.out.println("");
			System.out.println("*************************************");
			
			
			//user balance
			System.out.println("ENTER ACCOUNT STARTING BALANCE " );
			sBal = sc.nextDouble();
			System.out.println("BALANCE $" + sBal);
			//error for negative balance input
			if (sBal <=0) {
				System.err.println("********************************");
				System.out.println("");
				System.err.println("!ERROR!");
				System.err.println("ACCOUNT BALANCE MUST BE POSITIVE");
				System.out.println("");
				System.err.println("********************************");
				
				
				System.out.println("ENTER ACCOUNT STARTING BALANCE " );
				sBal = sc.nextDouble();
				System.out.println("");
				System.out.println("BALANCE $" + sBal);
			}
			
			
			
			//user account
			
			final AccountHolder member = new AccountHolder(sBal);
			System.out.println("");
			System.out.println("");
			System.out.println("$" + member.getBal());
			
			
			//user menu
			int cont = 1;
			
			while(cont==1) {
				
				System.out.println("*****ACCOUNT MENU*****");
				System.out.println("1. DEPOSIT");
				System.out.println("2. WITHDRAWAL");
				System.out.println("3. MONTHLY INTEREST");
				System.out.println("**********************");
				
				//switch case
				menu = sc.nextInt();
				switch(menu) {
				case 1: member.Deposit();break;
				case 2: member.Withdrawal();break;
				case 3: member.monthlyInterest(sBal);break;
				}
				//user balance and option to continue or exit
				System.out.println("");
				System.out.println("WOULD YOU LIKE TO DO ANYTHING ELSE");
				sc.nextLine();
				
				
				System.out.println("PRESS 1 TO CONITNUE 2 TO EXIT");
				cont = sc.nextInt();
				System.out.println(cont);
			}
	}

}
