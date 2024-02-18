package leetcodeDSA;

import java.util.ArrayList;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		int[] height= {1,3,2,4,5,6,7,8,9};
//		arr[0];
		int max=0; 
		 List<Integer> ls= new ArrayList<Integer>();
		 

	        for (int i=0; i<=height.length/2;i++){
	            for (int j=height.length-1;j>=height.length/2;j--){
	                 int len=j-i; 
	                 int temp= Math.min(height[i], height[j]);
	                 ls.add(temp*temp*len);
	                 if((temp*temp*len)>max)
	                	 max=temp*temp*len;
	            }
	        }
	        
	        
	        System.out.println(ls);
	        System.out.println(max);
	        

	}

}
