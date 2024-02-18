package leetcodeDSA;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		int[] nums= {23,4,2,42};
		int target=8;
		
		if(2<=nums.length&&nums.length<=1000)
			return 0;
		if(-100000000 >=target && target >= 100000000)
			return 0;
		List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<(nums.length-1); i++) {
            for (int j=(i+1); j<nums.length; j++) {
            	if(-100000000 >= nums[i]&& nums[i] >= 100000000)
            		if(-100000000 >= nums[i]&& nums[i] >= 100000000)
            			return 0;
            	
                if(nums[i]<=target&&nums[j]<=target){
                	
                     if((nums[i]+nums[j])==target){
                     list.add(i);
                     list.add(j);
                    }
                }

        }
    }

        int[] ret = new int[list.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = list.get(i).intValue();
        }
        return ret;
}
