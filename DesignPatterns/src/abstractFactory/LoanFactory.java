
package abstractFactory;

/**
 * 	LoanFactory(factory class) that inherit AbstractFactory class to generate the object of concrete class based on given information.
 */
class LoanFactory extends AbstractFactory{  
    public IBank getBank(String bank){  
         return null;  
   }  
 
    /**
     * returns loan factory based on users choice.
     */
public Loan getLoan(String loan){  
if(loan == null){  
  return null;  
}  
if(loan.equalsIgnoreCase("Home")){  
  return new HomeLoan();  
} else if(loan.equalsIgnoreCase("Business")){  
  return new BusinessLoan();  
} else if(loan.equalsIgnoreCase("Education")){  
  return new EducationLoan();  
}  
return null;  
}  

}  
