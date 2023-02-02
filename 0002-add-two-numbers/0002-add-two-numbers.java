// 김진호

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
import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode ans = listNode;
        
        int tmp = 0;
        
        while (true) {
            if (l1 == null && l2 == null) break;
            
            int sum = tmp;
            
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            tmp = sum / 10;
            sum %= 10;
            
            ans.next = new ListNode(sum);
            ans = ans.next;
        }
        
        if (tmp == 1) {
            ans.next = new ListNode(tmp);
        }
        
        return listNode.next;
    }
}