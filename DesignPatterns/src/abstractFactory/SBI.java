
package abstractFactory;

/**
 * SBI (concrete class) that implement the IBank interface.
 */
public class SBI implements IBank{
	 private final String BankName;  
     public SBI(){  
               BankName="SBI BANK";  
       }  
     
     /**
      * returns bank name.
      */
      public String getBankName(){  
                 return BankName;  
      }  
}
