
/*Given a linked list, remove the n-th node from the end of list and return its head.

        Example:

        Given linked list: 1->2->3->4->5, and n = 2.

        After removing the second node from the end, the linked list becomes 1->2->3->5.
        Note:

        Given n will always be valid.

        Follow up:

        Could you do this in one pass?*/

package LeetCode.Medium;

import Utils.ListNode;

public class Medium19RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 1;
        ListNode temp = head;
        ListNode prev = null;

        while(temp.next != null){
            prev = temp;
            temp =  temp.next;
            length++;
        }

        n = length - n + 1;

        if(length == n){
            if(prev == null){
                head = null;
            }else{
                prev.next = null;
            }
            return head;
        }
        if(n == 1){
            return head.next;
        }

        temp = head;
        for(int i = 1; i < n; i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

        return head;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(2);
        node = node.insertFront(9);
        node = node.insertFront(8);
        node = node.insertFront(5);
        System.out.println(node);

        node = removeNthFromEnd(node, 2);

        System.out.println(node);


    }
}
