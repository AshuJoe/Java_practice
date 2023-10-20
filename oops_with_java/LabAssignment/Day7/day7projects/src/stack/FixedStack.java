package stack;
//import stack.*;

public class FixedStack implements stackif {
	
	public static int top=0;

	Customer []arr;
	public FixedStack() {
		arr=new Customer[STACK_SIZE];
	}
public void push(Customer o) {
		System.out.println("in fixed stack\n");
		if(top==STACK_SIZE-1)
			System.out.println("Stack is full");
		else{
		arr[top++]=o;
		}
}
public  void pop () {
		
		if(top==-1){ 
		System.out.println("Stack is empty");;
		}
		else {
		System.out.println(arr[--top]);
		}
	
}
}