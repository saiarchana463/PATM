
package abstractFactory;

/**
 * 	Loan abstract class inherited by EducationLoan,BusinessLoan,HomeLoan.
 * 	
 */
abstract class Loan {
	   double rate;  
	   abstract void setInterestRate(double rate);  
	   /**
	    * 
	    * @param loanamount
	    * @param years
	    * 
	    * 	calculateLoanPayment() will return EMI to be paid.
	    */
	   public void calculateLoanPayment(double loanamount, int years)  
	   {  
	         double EMI;  
	         int n;  
	  
	         n=years*12;  
	         rate=rate/1200;  
	         EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;  
	  
	System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");     
	 }  
}
