
package abstractFactory;

/**
 * 	ICICI(concrete class) that implement the IBank interface.
 */
public class ICICI implements IBank{
	 private final String BankName;  
     ICICI(){  
              BankName="ICICI BANK";  
      }  
     
     /**
      * returns bank name 
      */
      public String getBankName() {  
                return BankName;  
     }  
}
