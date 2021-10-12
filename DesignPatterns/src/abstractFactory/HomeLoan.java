
package abstractFactory;

/**
 * 	HomeLoan(concrete class) that extend the Loan abstract class
 */
public class HomeLoan extends Loan {
	
	/**
	 * sets user input to rate.
	 */
	public void setInterestRate(double r){  
        rate=r;  
   }  

}
