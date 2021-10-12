
package abstractFactory;

/**
 * 	BusinessLoan(concrete class) that extend the Loan abstract class
 */
public class BusinessLoan extends Loan {

	/**
	 *  sets user input to interest
	 */
	@Override
	protected void setInterestRate(double r) {
		rate = r;		
	}

}
