public class Solution {
    public ListNode deleteDuplicates(ListNode A)  {
        ListNode dummy = new ListNode(0); 
        dummy.next = A; 
        ListNode prev = dummy; 
        ListNode current = A; 
  
        while (current != null) { 
            while (current.next != null && prev.next.val == current.next.val) 
                current = current.next; 
  
            
            if (prev.next == current){ 
                prev = prev.next; 
            }else{
                prev.next = current.next; 
            }
            
            current = current.next; 
        } 
        A = dummy.next;
        return A;
    }
}
