package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Operation{
	
	
	/**
	 * 
	 */
	 public static Map<Integer,Integer> addNotesToMachine(){
		 Map<Integer,Integer> notesInMachine = new HashMap<>();
			notesInMachine.put(2000, 0);
			notesInMachine.put(500, 0);
			notesInMachine.put(200, 0);
			notesInMachine.put(100, 0);
			return notesInMachine;
	}
	
	/**
	 * This method contains 3 operations performed by ATM and sets the account number for that particular customer object
	 * @param accountNo 		Account number of that particular customer
	 * @param br        		BufferedReader resource
	 * @param notesInMachine	Total notes available in ATM machine
	 * @throws IOException		If input or output exception occurred
	 */
	public static void operation(String accountNo,BufferedReader br,Account accountObj) throws IOException {
		String option="";
		System.out.println("Select an option :\n1.Deposite\t2.Withdrawal\t3.Balance");
		option = br.readLine();
		if(option.equals("1")) {
			System.out.println(deposite(br,accountObj.getAmount(),addNotesToMachine(),accountObj));
		}
		else if(option.equals("2")) {
			System.out.println(Operation.withdrawal(br,accountObj.getAmount(),addNotesToMachine(),accountObj));
		}
		else if(option.equals("3")) {
			Operation.checkBalance(accountObj);
		}
		else {
			System.out.println("invalid option!");
		}
		accountObj.setAccountNo(accountNo);
	}
	
	/**
	 * This method validates the deposit amount and if valid adds deposit amount to balance and notes to total notes available in machine
	 * @param br						BufferedReader resource
	 * @param amount 					Amount of that customer
	 * @param notes						InMachine Total notes available in ATM machine
	 * @return 							message based on condition 
	 * @throws NumberFormatException 	If Number format exception occurred
	 * @throws IOException				If input or output exception occurred
	 */
	
	public static String deposite(BufferedReader br, int amount,Map<Integer,Integer> notesInMachine,Account accountObj) throws NumberFormatException, IOException {
		String reEnterOrExit="1";
		while(reEnterOrExit.equals("1")) {
			System.out.println("Enter the amount to be desposited : ");
			int depositeAmount = Integer.parseInt(br.readLine());
			int[] noteCounter = {0,0,0,0};
			System.out.println("Number of 2000 notes : ");
			noteCounter[0] = Integer.parseInt(br.readLine());
			System.out.println("Number of 500 notes : ");
			noteCounter[1] = Integer.parseInt(br.readLine());
			System.out.println("Number of 200 notes : ");
			noteCounter[2] = Integer.parseInt(br.readLine());
			System.out.println("Number of 100 notes : ");
			noteCounter[3] = Integer.parseInt(br.readLine());
			int notesTotal = (noteCounter[0]*2000)+(noteCounter[1]*500)+(noteCounter[2]*200)+(noteCounter[3]*100);
			if(notesTotal == depositeAmount) {
				
				accountObj.setAmount(amount+depositeAmount);
				int i = 0;
				for (Map.Entry<Integer,Integer> entry : notesInMachine.entrySet()) {
				    notesInMachine.put(entry.getKey(),Integer.valueOf(entry.getValue()+noteCounter[i++]));
				}
				return "Money deposited Successfully!";
				
			}
			System.out.println("Wrong Amount");
			System.out.println("Select an option 1.Re-Enter Amount 2.Exit");
				reEnterOrExit = br.readLine();
				
		}
		return "Transaction Cancelled";
			
	}
	
	/**
	 * This method checks is withdrawal possible or not, if possible then it updates the Balance.
	 * @param br						BufferedReader resource
	 * @param amount					Amount of that customer
	 * @param notesInMachine			Total notes available in ATM machine
	 * @return 							returns message based on withdrawal amount and notes available in machine
	 * @throws NumberFormatException 	If Number format exception occurred
	 * @throws IOException				If input or output exception occurred
	 */
	public static String withdrawal(BufferedReader br,int amount,Map<Integer,Integer> notesInMachine,Account accountObj) throws NumberFormatException, IOException {
		System.out.println("Enter the amount to be withdraw :");
		int withdrawAmount = Integer.parseInt(br.readLine());
		String notesNotAvailable = Validation.checkAvailablity(withdrawAmount,notesInMachine);
		if(withdrawAmount > amount) {
			return "Insufficient Balance";
		}
		else if(notesNotAvailable == null) {
			return "Insufficient Notes! Please re-enter the amount";
		}
		else {
			accountObj.setAmount(amount-withdrawAmount);
			return notesNotAvailable;
		}
	}

	/**
	 * This method displays Balance of that customer 
	 */
	public static void checkBalance(Account accountObj) {
		System.out.println("Balnace : "+accountObj.getAmount());
	}
}
