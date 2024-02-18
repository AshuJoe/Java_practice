package leetcodeDSA;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PAYPALISHIRING"; 
		int numRows=4;
		
	        String n="";
	        
	        List<Character>[] rows = new List[numRows];
	        for (int i = 0; i < numRows; ++i)
	            rows[i] = new ArrayList<>();
	        
//	        
//	        for(int i=0;i <s.length();i++) {
//	        if(numRows>0) {
//	        if((i+(numRows+1)*i)<=s.length()) {	
//	        System.out.print(n.concat(""+s.charAt(i+(numRows+1)*i)));
//	        }}
//	        
//	        }
	        // p-5-i
	        // a-
//	        int i;
	        
	       if (numRows==0){
	        //for (int i=0;i<s.length();i++) {	    	   
//	        	return n;
	       
	        }
	       if (numRows==1) {
//	    	   return s;
	       }
	       int counter=0;
	       while(counter <=s.length()) {
	       int zig=1;
	       if(counter==s.length()) {break;}
	    	   if(zig==1) {
	    	   for(int i=0;i<numRows;i++)  if(counter<s.length()){
	    	   rows[i].add(s.charAt(counter));
	    	   if(counter<s.length()) {
				   counter++;
			   }
	    	  // System.out.print(rows[i]);}
	    	   }
	    	   zig=0;}
	    	   
	    	   if(zig==0) {
	    		   for(int i=(numRows-2);i>0;i--) if(counter<s.length()){
	    			   rows[i].add(s.charAt(counter));
	    			   if(counter<s.length()) {
	    				   counter++;
	    			   }
	    	   }
	    		   zig=1;
	    		   
	    		   
	       }
	       
	       
	       }
	       //StringBuilder ret = new StringBuilder();
	        for(int i=0;i<numRows;i++) {
	        	//n=n.concat(rows[i].toString());
	        	for(int j=0;j<rows[i].size();j++)
	        	n=n.concat(rows[i].get(j).toString());
	        }
	      
//	      n= n.replaceAll("[^a-zA-Z0-9]", "");
//	      n= n.replaceAll(" ", "");
	      
	      System.out.println(n);
	       
	       
	       
	       
	        
//	        for(int i=0; i<=numRows;i++) {
//	        	rows[i]=list.get(i);
//	        }
//	        for(int i=0; i<=numRows;i++) {
//	        	System.out.println(arr[i][0]);
//	        }
	        
	        
	        /*
	        while(!(counter==list.size())) {
	        if((b%2)==0)
	        for(int i=b; i<=numRows;i++){
	            arr[i][j]=list.get(counter++);
	        }else{
	            for(j=1;j<=numRows;j++){
	            	for(int i=b;i<=numRows;i--)
                  
	                arr[i][j]=list.get(counter++);
	            }
	        }

	        }
	        
	        for(j=1;j<=numRows;j++){
            	for(int i=b;i<=numRows;i--);

	}*/
	}
}
