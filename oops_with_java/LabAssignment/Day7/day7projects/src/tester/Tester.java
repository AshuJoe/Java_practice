package tester;
import stack.*;
import java.util.Scanner;
public class Tester {
	private static int set=0;
		public static void main(String[] args) {
			
			System.out.println("choose one of the following option: \n1.Choose Fixed stack\n2.Choose Growable stack\n3.Push Data\n4.Pop Data\n5.Exit");
			
			FixedStack fix=new FixedStack() ;
			GrowableStack gro=new GrowableStack();
			
			System.out.println("choose the option...");
			try(Scanner sc=new Scanner(System.in)){
			while (true) {
			
		    
	        switch (sc.nextInt()) {
	        case 1: 
	                System.out.println("Entered fixed stack...");
	                set=1;
	               
	                
	                break;
	        case 2: System.out.println("Entered Growable stack...");
	        	    set=2;
	        	    
	        	    
	                break;
	        case 3: if (set==1) {
			        	System.out.println("Enter cutomer details...");
			    	    Customer t1=new Customer(sc.nextInt(),sc.next(),sc.next());
			        	fix.push(t1);
			        }
	               else if (set==2){
	            	   System.out.println("Enter customer details...");
			    	    Customer t1=new Customer(sc.nextInt(),sc.next(),sc.next());
	        	       gro.push(t1);
	               }
	        	       else {
	   		        	System.out.println("Please choose stack first.....");
	   		        }
	        
	               break;
	        case 4:
			        if(set==1) {
			        	fix.pop();
			        }
			        else if (set==2){
			        	gro.pop();
			        }
			        else {
			        	System.out.println("Please choose stack first.....");
			        }
			        
			       
			        break;
	        case 5: System.out.println("thank u...");
	                System.exit(0);
	                break;
	        }
//	        System.out.println("Choose the option again....");
	        System.out.println("choose the option for the next operation...");
	      }
//			 for (int i=0;i<3;i++) {
//			        System.out.println(arr[i]);
//	             
//	             }
			}
			
	  }
}


