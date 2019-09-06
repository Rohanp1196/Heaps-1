/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode dummy = new ListNode(0);
        
        ListNode result = dummy;
        
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((ListNode a , ListNode b) -> a.val-b.val);
        
        for (ListNode head: lists){
            
            if(head != null){
                pq.add(head);
            }
        }
        
        while(!pq.isEmpty()){
            
            ListNode min = pq.poll();
            dummy.next=min;
            dummy=dummy.next;
            
            if(min.next !=null)
                pq.add(min.next);
        }
        return result.next;
    }
        
    }
