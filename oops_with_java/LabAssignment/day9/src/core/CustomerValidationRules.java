package core;

import java.util.List;
import java.time.LocalDate;
import java.lang.IllegalArgumentException;
import java.time.format.DateTimeParseException;
public class CustomerValidationRules {
     public static void dups(String id ,List<Customer> customer) throws CustomerValidationException {
    	 Customer c1=new Customer(id);
    	 if (customer.contains(c1)) {
    		 throw new CustomerValidationException("Customer cant be added,dup email id...");
    	 }
     }
      public static Serviceplan parseandvalidateplan(String plan) throws IllegalArgumentException{
    	  return Serviceplan.valueOf(plan.toUpperCase());
      }
      public static double validateregamount(double amount,String plan) throws CustomerValidationException {
    	  if (Serviceplan.valueOf(plan.toUpperCase()).getcost()!=amount) {
    		  throw new CustomerValidationException("Amount doesnt match with any plan...!");
    	  }
      
    	  return amount;
      }
      public static LocalDate parseAndValidateDate(String date) throws DateTimeParseException,CustomerValidationException {
  		// parsing
  		LocalDate manuDate = LocalDate.parse(date);
  		
  		return manuDate;
  	}
      public static Customer validatereqinputs(String fn,String ln,String email,String password,String plan,double regamount,String dob,List<Customer> customer)throws DateTimeParseException,CustomerValidationException,IllegalArgumentException {
    	  dups(email,customer);
    	  LocalDate date=parseAndValidateDate(dob);
    	  double amt=validateregamount(regamount,plan);
    	  Serviceplan serviceplan=parseandvalidateplan(plan);
    	  return new Customer (Customer.id++,fn,ln,email,password,amt,serviceplan,date);
      }
}
