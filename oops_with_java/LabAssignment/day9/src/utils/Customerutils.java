package utils;
import core.*;
import java.util.List;

public class Customerutils {

	public static Customer login(String email,String password,List<Customer> customer) throws CustomerValidationException {
		Customer c1=new Customer(email);
		//Customer c2=new Customer(password);
		int index=customer.indexOf(c1);
		System.out.println(index);
//		int index1=customer.indexOf(c2);
		if (index== -1) {
			return customer.get(index);
			}
		else {
			throw new CustomerValidationException("Invalid credentials...!!!");
		}
}
	public static Customer changepassword(String email,String password,String newpassword,List<Customer> customer)throws CustomerValidationException {
		Customer c1=new Customer(password);
		int index=customer.indexOf(c1);
		if (index==-1) {
			throw new CustomerValidationException("Invalid credentials...!!!");
		}
		customer.get(index).setpassword(newpassword);
		return customer.get(index);
	}
	public static void unsubscribe(String email,List<Customer> customer) throws CustomerValidationException {
		Customer c1=new Customer(email);
		int index=customer.indexOf(c1);
		if (index==-1) {
			throw new CustomerValidationException("Invalid credentials...!!!");
		}
		customer.remove(customer.get(index));
	}
	
}
