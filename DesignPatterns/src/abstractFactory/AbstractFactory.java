package abstractFactory;

/**
 * 	AbstractFactory to get the factories for Bank and Loan Objects.
 */
abstract class AbstractFactory{  
	  public abstract IBank getBank(String bank);  
	  public abstract Loan getLoan(String loan);  
	} 
