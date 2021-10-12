
package abstractFactory;

/**
 * 	EducationLoan(concrete class) that extend the Loan abstract class
 */
public class EducationLoan extends Loan{

	/**
	 * sets user input to rate;
	 */
	@Override
	protected void setInterestRate(double r) {
		rate = r;
	}
	
}
