package leetcodeDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		int[] nums1= {2,4,5,3,6,8,9}; 
		int[] nums2= {};
				
		int m=nums1.length;
	    int n=nums2.length;
	    int[] nums3= new int[m+n];
		
	    Arrays.sort(nums2);
	    List<Integer> l=new ArrayList<Integer>();
	    if(m<=1000 && n<=1000) {
	    	
	    	for(int i=0; i<m;i++)
	    	nums3[i]=nums1[i];
	    	for(int i=0; i<n;i++)
	    	nums3[m+i]=nums2[i];
	    	
	    	Arrays.sort(nums3);
	    	
	    	
	    }
	    if((nums3.length%2)==0) {
	    Double d=(double) (((nums3[nums3.length/2]))+((nums3[(nums3.length/2)+1])))/2;
	    return d
	    }else {
		    Double d=(double) ((nums3[nums3.length/2]));
		    return d
		    }
	    
	}

}
