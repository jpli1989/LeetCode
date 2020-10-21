/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        //new head
        ListNode result = new ListNode(0);
        ListNode cur = result;
        
        while(l1!=null && l2 !=null){
            if(l1.val < l2.val){
                //point to the smaller value node
                cur.next = l1;
                //move to next node
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        
        if(l1 != null) cur.next = l1;
        if(l2 != null) cur.next = l2;
        
        return result.next;
    }
}
