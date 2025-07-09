class Solution {
    public ListNode reverseList(ListNode inputListHead) {
        ListNode reversedListHead = null;
        
        while(inputListHead!=null) {
            ListNode next = inputListHead.next;
            
            inputListHead.next = reversedListHead; //Break the link  
            reversedListHead = inputListHead;      //Update output list
            inputListHead = next;                  //Move to the next value in input list
        }
        return reversedListHead;
    }
}
