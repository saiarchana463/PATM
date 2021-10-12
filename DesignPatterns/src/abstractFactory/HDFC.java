
package abstractFactory;

/**
 * 	HDFC(concrete class) that implement the IBank interface.
 */
public class HDFC implements IBank{
	private final String BankName;  
	
    public HDFC(){  
           BankName="HDFC BANK";  
   }  
    
    /**
     * returns bank name
     */
   public String getBankName() {  
             return BankName;  
   }  
}
