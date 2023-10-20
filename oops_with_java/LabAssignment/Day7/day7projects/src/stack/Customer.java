package stack;

public class Customer {
     private int id;
     private String name;
     private String address;
     public Customer(int ide,String name,String addres){
    	 id=ide;
    	 this.name=name;
    	 address=addres;
    	}
     
     public String toString(){
    	 return "id : "+id+"Name : "+name+"Address : "+address; 
     }

}
