
package abstractFactory;

/**
 * 	BankFactory(factory class) that inherit AbstractFactory class to generate the object of concrete class based on given information.
 */
public class BankFactory extends AbstractFactory{  
	
	/**
	 * implements getBank and returns BankName based on user input
	 */
	   public IBank getBank(String bank){  
	      if(bank == null){  
	         return null;  
	      }  
	      if(bank.equalsIgnoreCase("HDFC")){  
	         return new HDFC();  
	      } else if(bank.equalsIgnoreCase("ICICI")){  
	         return new ICICI();  
	      } else if(bank.equalsIgnoreCase("SBI")){  
	         return new SBI();  
	      }  
	      return null;  
	   }  
	  public Loan getLoan(String loan) {  
	      return null;  
	   }  
	}