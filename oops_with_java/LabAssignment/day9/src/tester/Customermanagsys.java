package tester;
import core.*;
import static utils.Customerutils.*;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import static core.CustomerValidationRules.validatereqinputs;
public class Customermanagsys {
	/*Customer management system
	Supply Options
	1. Sign up (customer registration)
	2. Sign in (login)
	i/p : email n password
	3. Change password
	i/p : email n old password n new password
	4. Un subscribe customer
	i/p : customer email

	5. Display all customers.
	0. Exit*/ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose the following options:\n1. Sign up (customer registration)\n2. Sign in (login)\n3. Change password\n4. Un subscribe customer\n5. Display all customers.\n0. Exit");
	    boolean exit=false;
	    List<Customer> customerlist = new ArrayList<>();
	    while(!exit) {
	    	try {
	    	switch(sc.nextInt())
	    	{
	    	case 1:System.out.println("Enter firstname,lastname,email,password,plan and the corresponding cost,date of birth to register....");
	    	       Customer cust1=validatereqinputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.next(),sc.nextDouble(),sc.next(),customerlist);
	    	       customerlist.add(cust1);
	    	       System.out.println("Signup completed...");
	      	       System.out.println("your id is"+Customer.id);
	    	       break;
	    	case 2:System.out.println("Enter email id and password to login.....");
//	    	       cust1=new Customer(sc.next(),sc.next());
	    	       String id=sc.next();
	    	       String pass=sc.next();

	    	       Customer cust2=login(id,pass,customerlist);
	    	       System.out.println(cust2);
	    	       break;
	    	case 3:System.out.println("Enter email id,old password and new password to set new password...");
	    	       cust2=changepassword(sc.next(),sc.next(),sc.next(),customerlist);
	    	       break;
	    	case 4:System.out.println("Enter email id to unsubscribe...");
	    	       unsubscribe(sc.next(),customerlist);
	    	       System.out.println("Customer unsubscribed successfully");
	    	       break;
	    	case 5:System.out.println("Customer list...");
	    	       for (Customer c:customerlist) {
	    	    	   System.out.println(c);
	    	       }
	    	       break;
	    	case 6:exit=true;
	    	       System.exit(0);
	    	   }
	    	}
	    	catch(Exception e) {
	    		System.out.println(e);
	    		System.out.println("plz retry...");
	    		sc.nextLine();
	    	}
	    	
	    }
	    sc.close();
	    System.out.println("main over...");
	}
}
