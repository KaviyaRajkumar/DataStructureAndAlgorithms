class Solution {
    public ListNode reverseList(ListNode current) {
        ListNode reversedListHead = null;
        
        while(current!=null) {
            ListNode next = current.next;
            
            current.next = reversedListHead; //Break the link  
            reversedListHead = current;      //Update output list
            current = next;                  //Move to the next value in input list
        }
        return reversedListHead;
    }
}
