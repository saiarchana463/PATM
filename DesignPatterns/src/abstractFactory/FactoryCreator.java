
package abstractFactory;

/**
 * 	FactoryCreator class to get the factories by passing an information such as Bank or Loan.
 */
public class FactoryCreator {  
	/**
	 * 
	 * @param choice
	 * @return
	 *  returns factory based on user choice
	 */
    public static AbstractFactory getFactory(String choice){  
     if(choice.equalsIgnoreCase("Bank")){  
        return new BankFactory();  
     } else if(choice.equalsIgnoreCase("Loan")){  
        return new LoanFactory();  
     }  
     return null;  
  }  
}
