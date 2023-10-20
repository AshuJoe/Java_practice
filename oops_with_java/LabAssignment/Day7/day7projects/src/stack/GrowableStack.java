package stack;
//import stack.*;


public class GrowableStack implements stackif {
	public static int top1=0;
	Customer [] arr;
	
	public GrowableStack()
	{
	  arr =new Customer[STACK_SIZE*2];
		
	}

public void push(Customer o) {
	
	
		if(top1>=STACK_SIZE) {
	
		System.out.println("Limit reached...but ur in growable Stack so proceed....");
		Customer [] arr1=new Customer[STACK_SIZE*2];
	    for(int i=0;i<top1;i++) {
	    	arr1[i]=arr[i];
	    }
	    arr1[top1++]=o;
	    arr=arr1;}
	    else{
			arr[top1++]=o;
		}
	
		
	}
	    
	

 public  void pop (){
	
	if(top1<=0){ 
	System.out.println("Stack is empty");;
	}
	else
	System.out.println(arr[--top1]);

}
}