package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/**
 * @author savant
 * Checks customer is valid or not , if valid passes control to Account.
 */
public class ATM {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Welcome.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedHashSet<Account> customerList = new LinkedHashSet<>();
		
		boolean sameUser = true,exitOrEntry = true,validUser=true;
		String accountNo;
		customerList = Validation.userObjectsCreation(customerList);
//		System.out.println(customerList);
		while(exitOrEntry) {
				 System.out.println("Enter your account Number :");
				 accountNo = br.readLine();
				 sameUser = true;
				 Account accountObj	 = Validation.returnUserObject(customerList,accountNo);
				 if(validUser && sameUser && accountObj != null) {
					 while(sameUser) {
							 Operation.operation(accountNo,br,accountObj);
							 customerList.add(accountObj);
							 System.out.println("Do you want to continue (yes/no):");
							 sameUser = br.readLine().equalsIgnoreCase("yes");
						} 
				 }
				else {
					System.out.println("Invalid account number. Enter correct number");
					System.out.println("Do you want to continue (yes/no):");
					 sameUser = br.readLine().equalsIgnoreCase("yes");
				}
			if(!sameUser)
			System.out.println("Thank you...");
			System.out.println();
			 
		}
		
	}

	
}
