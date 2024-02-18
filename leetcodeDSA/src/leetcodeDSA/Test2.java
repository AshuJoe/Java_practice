  
 
class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
//         class ListNode {
//             public int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
        ListNode emp=null,temp;

		int i=0;
		int j=0;
		
		temp=l1;
		int count=0; 
		while(temp!=null) {
			if(count>=100 && temp.val>9)
				return emp;
			
			i+= temp.val;
			++count;
			temp=l1.next;
		
		}
		temp=l1;
		count=0; 
		while(temp!=null) {
			if(count>=100 && temp.val>9)
				return emp;
			
			j+= temp.val;
			++count;
			temp=l2.next;
		
		}
		
		i+=j;
		j=0;
		temp=emp;
		while(i==0) {
			
			temp.val= i%10;
			i=i/10;
			temp=temp.next;
			
		}
		
		return emp;
        
    }
}